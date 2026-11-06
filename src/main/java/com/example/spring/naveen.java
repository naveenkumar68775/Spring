package com.example.spring;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/thunder")
public class naveen {
    @GetMapping("/stark")
    String name(){
        return "<h1>Ben 10</h1>" +
                "200Rs";
    }
    @GetMapping("naveen/name")
    String getTodoWithId(){
        return "God have some major place";
    }

    @GetMapping ("retrieve")
    String value(){
        return "<H1>Return</H1>";
    }
    @GetMapping("/{last}")
    String reise(@PathVariable int last){
        return "NAME : Naveenkumar " + last;

    }
    @GetMapping
    String strive(@RequestParam String name , int pass){
        return "Name: "+ name + " " + "Password: "+ pass;
    }






}
