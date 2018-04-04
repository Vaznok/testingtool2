package com.epam.rd.data.access.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Data
@Entity
@Table(name = "roles")
public class UserRole implements Serializable {

    @Id
    private String role;

    @ManyToMany(fetch = FetchType.LAZY)
    private Set<Permission> permissions;
}

