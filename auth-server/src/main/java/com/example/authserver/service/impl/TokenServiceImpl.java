package com.example.authserver.service.impl;


import com.example.authserver.domain.redis.Token;
import com.example.authserver.repository.TokenRepository;
import com.example.authserver.service.TokenService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/*
    @author uurdev
    @date 10.12.2022
*/
@Service
@RequiredArgsConstructor
public class TokenServiceImpl implements TokenService {
    private final TokenRepository tokenRepository;

    @Override
    public Token save(Token token) {
        return tokenRepository.save(token);
    }

    @Override
    public Token findById(String id) {
        return tokenRepository.findById(id).orElseThrow(()-> new RuntimeException("Token not found"));
    }

    @Override
    public List<Token> getAll() {
        return StreamSupport
                .stream(tokenRepository.findAll().spliterator(),false)
                .collect(Collectors.toList());
    }
}
