package com.example.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworld {
    @GetMapping("/how")
    String name(){
        return "<h1>Thunder</h1>  ";
    }


}
