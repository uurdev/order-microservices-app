package com.example.authserver.dto;


import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

/*
    @author uurdev
    @date 10.12.2022
*/
@Validated
@Getter
@Setter
public class LoginDTO {
    @NotNull
    private String userName;
    @NotNull
    private String password;
}
