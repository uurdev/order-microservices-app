package com.example.authserver.domain.redis;


import lombok.*;
import org.springframework.data.redis.core.RedisHash;

import java.time.LocalDateTime;

/*
    @author uurdev
    @date 10.12.2022
*/
@RedisHash(value = "Tokens", timeToLive = 86400)
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Token {
    private String id;
    private String username;
    private String authenticationToken;
    private String modifiedBy;
    private LocalDateTime modifiedOn;
    private String createdBy;
    private LocalDateTime createdOn;
}
