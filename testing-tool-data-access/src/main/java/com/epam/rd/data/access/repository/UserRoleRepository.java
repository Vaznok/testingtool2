package com.epam.rd.data.access.repository;

import com.epam.rd.data.access.domain.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;

@Repository
@Table(name = "roles")
public interface UserRoleRepository extends JpaRepository<UserRole, Long> {

}

