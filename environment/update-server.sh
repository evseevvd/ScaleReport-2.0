#!/bin/sh

workdir=/opt/scale-server;

systemctl stop scale-server;
yes | cp -rf scale-server-2.0.1.jar ${workdir};
chmod 775 ${workdir}/scale-server-2.0.1.jar;
systemctl start scale-server;
exit 0;
