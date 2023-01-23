package com.humberto.dtotutorial.repository;

import com.humberto.dtotutorial.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
