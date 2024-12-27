package edu.polytech.keycloak;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")

public class DemoController {

    @GetMapping
    public  String hello(){
        return "Hello from Spring Boot Keycloak";
    }

    @GetMapping("hello-12")
    public  String hello2(){
        return "Hello from Spring Boot Keycloak & Admin";
    }
}
