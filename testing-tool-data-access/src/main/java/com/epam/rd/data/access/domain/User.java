package com.epam.rd.data.access.domain;

import lombok.Data;

import javax.persistence.*;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "users")
public class User implements Serializable {

    public User() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String email;

    @Column
    private String password;

    @Column
    private Boolean enabled;

    @Column(name = "user_role")
    private String userRole;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column
    private Date birthday;

    @Column
    private String city;

    @Column
    private Boolean gender;

    @Column(name = "mobile_phone")
    private String mobilePhone;

}


