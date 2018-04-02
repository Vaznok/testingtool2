package com.epam.rd.data.access.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "permissions")
public class Permission implements Serializable {

    public Permission() {
    }

    public Permission(String permission) {
        this.permission = permission;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(unique = true)
    private String permission;

    @ManyToMany(fetch = FetchType.LAZY)
    private Set<User> users;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "id=" + id +
                ", permission='" + permission + '\'' +
                ", users=" + users +
                '}';
    }
}

