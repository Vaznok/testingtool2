package com.epam.rd.data.access.repository;

import com.epam.rd.data.access.domain.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;

@Repository
@Table(name = "permissions")
public interface PermissionRepository extends JpaRepository<Permission, Long> {
}
