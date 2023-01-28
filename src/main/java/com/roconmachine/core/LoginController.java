package com.roconmachine.core;

import com.roconmachine.openapi.api.LoginApi;

import com.roconmachine.openapi.model.Users;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController implements LoginApi {
    @Override
    public ResponseEntity<Void> loginPost(Users users) {
        return LoginApi.super.loginPost(users);
    }
}
