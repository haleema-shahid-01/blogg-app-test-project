package com.example.blogapp.DTOs;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Date;

@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDTO {
    String firstName;
    String lastName;
    String email;
    @JsonProperty("pfp")
    String profilePicture;
    Date dob;
    String bio;
    String verificationCode;
    Boolean isEnabled;
}