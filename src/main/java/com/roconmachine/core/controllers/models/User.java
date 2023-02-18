package com.roconmachine.core.controllers.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @JsonProperty("userName")
    @NotNull
    @NotBlank(message = "userName is required.")
    private String userName;

    @JsonProperty("password")
    @NotNull
    @NotBlank(message = "password is required.")
    private String password;

    @JsonProperty("email")
    @NotNull
    @NotBlank(message = "email is required.")
    private String email;

    @JsonProperty("age")
    private BigDecimal age;
}
