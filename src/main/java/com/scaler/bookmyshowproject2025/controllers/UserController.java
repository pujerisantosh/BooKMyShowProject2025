package com.scaler.bookmyshowproject2025.controllers;

import com.scaler.bookmyshowproject2025.dtos.ResponseStatus;
import com.scaler.bookmyshowproject2025.dtos.SignUpUserRequestDTO;
import com.scaler.bookmyshowproject2025.dtos.SignUpUserResponseDTO;
import com.scaler.bookmyshowproject2025.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.scaler.bookmyshowproject2025.services.UserServices;

@Controller
public class UserController {
    private UserServices userServices;

    @Autowired
    public UserController(UserServices userServices){
      this.userServices = userServices;
    }
    public SignUpUserResponseDTO signUpUser(SignUpUserRequestDTO  request){

        SignUpUserResponseDTO response = new SignUpUserResponseDTO();

        try{
            User user = UserServices.signUpUser(
                    request.getUsername(),
                    request.getEmail(),
                    request.getPassword()
            );
            response.setUserId(user.getId());
            response.setMessage("User successfully registered!");
            response.setStatus(ResponseStatus.SUCCESS);
        } catch (Exception ex){
            response.setMessage("Failed to create the user : " + ex.getMessage());
            response.setStatus(ResponseStatus.FAILURE);
        }
        return response;
    }

    }



