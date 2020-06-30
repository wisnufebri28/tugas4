package com.latihan2.latihan2.repository;

import com.latihan2.latihan2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<User, String> {

    User findById(int id);
    User findByUsername(String username);
}
