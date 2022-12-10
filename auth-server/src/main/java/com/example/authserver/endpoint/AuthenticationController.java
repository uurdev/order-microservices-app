package com.example.authserver.endpoint;


import com.example.authserver.dto.LoginResponseDTO;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/*
    @author uurdev
    @date 10.12.2022
*/
@RestController
@RequestMapping("/api/v1/auths")
public class AuthenticationController {

    @PostMapping(value = "", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<LoginResponseDTO> validatePost() {
        return ResponseEntity.ok(LoginResponseDTO.builder().status("OK").methodType(HttpMethod.POST.name())
                .isAuthenticated(true).build());
    }

    @GetMapping(value = "", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<LoginResponseDTO> validateGet(HttpServletRequest request) {
        String username = (String) request.getAttribute("username");
        String token = (String) request.getAttribute("jwt");
        return ResponseEntity.ok(LoginResponseDTO.builder().status("OK").methodType(HttpMethod.GET.name())
                .username(username).token(token)
                .isAuthenticated(true).build());
    }

    @PostMapping(value = "/whitelisted", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<LoginResponseDTO> validateWhitelistedPost() {
        return ResponseEntity.ok(LoginResponseDTO.builder().status("OK").methodType(HttpMethod.POST.name()).build());
    }

    @GetMapping(value = "/whitelisted", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<LoginResponseDTO> validateWhitelistedGet(HttpServletRequest request) {
        String username = (String) request.getAttribute("username");
        return ResponseEntity.ok(LoginResponseDTO.builder().status("OK").methodType(HttpMethod.GET.name()).username(username).build());
    }
}
