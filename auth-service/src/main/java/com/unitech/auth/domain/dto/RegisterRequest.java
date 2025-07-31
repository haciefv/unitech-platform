package com.unitech.auth.domain.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class RegisterRequest {
    @NotBlank(message = "Name field is mandatory ")
    private String name;
    @NotBlank(message = "Surname field is mandatory ")
    private String surname;

    @NotBlank(message = "Password field is mandatory ")
    @Size(min = 7, message = "Password must contain at least 7 symbols!")
    private String password;
    @NotBlank(message = "username field is mandatory ")
    private String email;

    public String getEmail() {
        return email;
    }

    public RegisterRequest setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getName() {
        return name;
    }

    public RegisterRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public RegisterRequest setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public RegisterRequest setPassword(String password) {
        this.password = password;
        return this;
    }

}
