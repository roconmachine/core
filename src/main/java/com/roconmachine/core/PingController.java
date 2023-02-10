package com.roconmachine.core;

import com.roconmachine.openapi.api.PingApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class PingController implements PingApi {

    @Override
    public ResponseEntity<String> getPing() {
        return ResponseEntity.ok("OK");
    }
}
