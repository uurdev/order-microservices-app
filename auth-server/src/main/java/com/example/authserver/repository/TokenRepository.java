package com.example.authserver.repository;



/*
    @author uurdev
    @date 10.12.2022
*/

import com.example.authserver.domain.redis.Token;
import org.springframework.data.repository.CrudRepository;

public interface TokenRepository extends CrudRepository<Token, String> {
}
