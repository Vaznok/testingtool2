package com.epam.rd.data.access.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Data
@Entity
@Table(name = "permissions")
public class Permission implements Serializable {

    @Id
    private String permission;
}
