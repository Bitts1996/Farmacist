package com.example.Farmacist.controller;

import com.example.Farmacist.Repository.GRegistrationRepository;
import com.example.Farmacist.exception.InternalServerException;
import com.example.Farmacist.models.Register;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1")
@NoArgsConstructor
@Validated
public class RegistrationController {

    @Autowired
    GRegistrationRepository registrationRepository;

    @PostMapping(value = "/register",consumes = "application/json;charset=UTF-8", produces = "application/json;charset=UTF-8")
    public ResponseEntity<Object> onRegistration(@RequestBody Register registrationFormData){
        try{
            registrationRepository.save(registrationFormData);
        }
        catch(Exception e){
            System.out.println(e.toString());
            throw new InternalServerException();
        }
         return new ResponseEntity<>( HttpStatus.CREATED);
    }

}
