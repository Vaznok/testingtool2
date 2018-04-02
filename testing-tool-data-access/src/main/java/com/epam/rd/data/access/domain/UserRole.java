package com.epam.rd.data.access.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "roles")
public class UserRole implements Serializable {

    public UserRole() {
    }

    public UserRole(Long id, String role, Set<User> users) {
        this.id = id;
        this.role = role;
        this.users = users;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String role;

    @OneToMany(fetch = FetchType.LAZY)
    private Set<User> users;

    @Override
    public String toString() {
        return "UserRole{" +
                "id=" + id +
                ", role='" + role + '\'' +
                ", users=" + users +
                '}';
    }
}

