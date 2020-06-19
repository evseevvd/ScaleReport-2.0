package ru.top.prom.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Владимир on 18.07.2016.
 *
 * Сущность Грузоотправитель
 */

@Entity
@Table(name = "sender", schema = "dbo")
public class Senders extends BaseEntity {

    @Id
    @Column(name = "sender_id")
    private Integer id;

    @Column(name = "sender_name")
    private String name;

    @Column(name = "sender_address")
    private String address;

    @Column(name = "sender_name_full")
    private String fullName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
