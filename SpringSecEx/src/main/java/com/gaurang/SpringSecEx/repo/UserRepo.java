package com.gaurang.SpringSecEx.repo;

import com.gaurang.SpringSecEx.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users, Integer> {
    Users findByUsername(String username);
}
