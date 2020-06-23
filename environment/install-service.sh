#!/bin/sh

USER=reporter;
workdir=/opt/scale-server;

if id ${USER} >/dev/null 2>&1; then
        echo -e "\e[41mInstall service fail: user exists.";
else
        echo -e "\e[34mCreate a new user 'reporter'";
        useradd reporter;
        echo -e "\e[34mCreate work directory";
        mkdir ${workdir};
        echo -e "\e[34mCopy files...";
        cp scale-server-2.0.1.jar ${workdir};
        cp scale-server.sh ${workdir};
        chown -R ${USER}:${USER} ${workdir};
        chmod 775 ${workdir}/scale-server-2.0.1.jar;
        chmod 775 ${workdir}/scale-server.sh;
        echo -e "\e[34mAdd new service 'scale-server'";
        cp scale-server.service /etc/systemd/system;
        systemctl daemon-reload;
        systemctl enable scale-server;
        echo -e "\e[34mStart service 'scale-server'";
        systemctl start scale-server;
        echo -e "\e[34mSuccess. Start 'systemctl start scale-server' Stop 'systemctl stop scale-server'";
        exit 0;
fi
