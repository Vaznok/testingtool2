package com.epam.rd.data.access.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;

import com.epam.rd.data.access.domain.Role;

@Repository
@Table(name = "roles")
public interface UserRoleRepository extends JpaRepository<Role, Long> {
}
