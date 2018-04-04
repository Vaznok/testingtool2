package com.epam.rd.data.access.repository;

import com.epam.rd.data.access.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import javax.persistence.Table;

@Repository
@Table(name = "users")
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
