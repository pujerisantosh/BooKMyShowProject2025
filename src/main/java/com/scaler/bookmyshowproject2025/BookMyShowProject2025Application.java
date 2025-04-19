package com.scaler.bookmyshowproject2025;

import com.scaler.bookmyshowproject2025.controllers.UserController;
import com.scaler.bookmyshowproject2025.dtos.SignUpUserRequestDTO;
import com.scaler.bookmyshowproject2025.dtos.SignUpUserResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BookMyShowProject2025Application implements CommandLineRunner {

    @Autowired
    private UserController userController;

    @Override
    public void run(String... args) throws Exception {
        SignUpUserRequestDTO request = new SignUpUserRequestDTO();
        request.setEmail("16santoshpujari@gmail.com");
        request.setUsername("Santosh");
        request.setPassword("123");

        SignUpUserResponseDTO response = userController.signUpUser(request);
        System.out.println(response.getMessage());
    }

    public static void main(String[] args) {
        SpringApplication.run(BookMyShowProject2025Application.class, args);
    }
}

