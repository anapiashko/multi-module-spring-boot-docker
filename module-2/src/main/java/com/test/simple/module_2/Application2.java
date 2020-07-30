package com.test.simple.module_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application2 {

    @GetMapping("/2")
    public String get(){
        return "module 2";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application2.class);//запуск приложения

    }
}