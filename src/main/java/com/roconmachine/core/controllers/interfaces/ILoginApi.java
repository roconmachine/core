package com.roconmachine.core.controllers.interfaces;

import com.roconmachine.core.controllers.models.User;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
@Validated
public interface ILoginApi {

    @PostMapping(value = "/login",
            consumes = "application/json",
            produces = "application/json"
    )
    public ResponseEntity<String> loginPost(@Valid @RequestBody User users);
}
