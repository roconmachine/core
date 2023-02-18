package com.roconmachine.core.controllers.models;


import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern.Flag;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterUserDto {

    @NotEmpty(message = "The full name is required.")
    @Size(min = 2, max = 100, message = "The length of full name must be between 2 and 100 characters.")
    private String fullName;

    @NotEmpty(message = "The email address is required.")
    @Email(message = "The email address is invalid.", flags = { Flag.CASE_INSENSITIVE })
    private String email;

    @NotNull(message = "The date of birth is required.")
    @Past(message = "The date of birth must be in the past.")
    private Date dateOfBirth;

    @NotEmpty(message = "The gender is required.")
    private String gender;


}