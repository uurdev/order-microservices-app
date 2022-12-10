package com.example.authserver.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/*
    @author uurdev
    @date 10.12.2022
*/
@Builder
@Getter
@Setter
public class LoginResponseDTO {
    private String status;
    private boolean isAuthenticated;
    private String methodType;
    private String username;
    private String token;
}
