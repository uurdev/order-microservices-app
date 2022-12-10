package com.example.authserver.util;



/*
    @author uurdev
    @date 10.12.2022
*/

import java.util.UUID;

public class RandomUUIDGenerator {
    public static String generateToken() {
        return UUID.randomUUID().toString();
    }
}
