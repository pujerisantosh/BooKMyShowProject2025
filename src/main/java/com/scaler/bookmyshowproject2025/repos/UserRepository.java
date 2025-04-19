package com.scaler.bookmyshowproject2025.repos;

import com.scaler.bookmyshowproject2025.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

     Optional<User> findByEmail(String email);


    }


