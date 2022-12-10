package com.example.authserver.service;


import com.example.authserver.domain.redis.Token;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

/*
    @author uurdev
    @date 10.12.2022
*/
public interface TokenService {
    Token save(Token token);
    Token findById(String id);
    List<Token> getAll();
}
