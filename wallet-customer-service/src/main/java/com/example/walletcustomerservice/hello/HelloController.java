package com.example.walletcustomerservice.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
    @author uurdev
    @date 27.09.2022
*/
@RestController
public class HelloController {
    @GetMapping(value = "/hello")
    public String hello(){return "hello";}
}
