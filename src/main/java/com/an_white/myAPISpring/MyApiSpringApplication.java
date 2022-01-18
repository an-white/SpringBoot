package com.an_white.myAPISpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyApiSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyApiSpringApplication.class, args);
    }

    @GetMapping("/first_ulr")
    public String first_url(@RequestParam(value = "kazita", defaultValue = "mea") String container) {
        return String.format("mi kazita %s", container);
    }
}
