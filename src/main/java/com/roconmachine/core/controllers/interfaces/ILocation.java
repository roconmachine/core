package com.roconmachine.core.controllers.interfaces;

import com.roconmachine.core.controllers.models.AddressDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

public interface ILocation {

    @PostMapping("/register")
    @RequestMapping(path = "/register",
            produces = {"application/json", "application/xml"}

    )
    public ResponseEntity<String> registerUser(@Valid @RequestBody AddressDto address);
}
