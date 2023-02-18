package com.roconmachine.core.controllers;



import com.roconmachine.core.controllers.interfaces.ILoginApi;
import com.roconmachine.core.controllers.models.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class LoginController implements ILoginApi {
    public ResponseEntity<String> loginPost(User users){
        return new ResponseEntity<>("logged in", HttpStatus.ACCEPTED);
    }
}
