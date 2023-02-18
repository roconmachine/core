package com.roconmachine.core.controllers;

import com.roconmachine.core.controllers.interfaces.ILocation;
import com.roconmachine.core.controllers.models.AddressDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController implements ILocation {


    public ResponseEntity<String> registerUser(AddressDto address) {

        return new ResponseEntity<>("valid address", HttpStatus.CREATED);
    }
}
