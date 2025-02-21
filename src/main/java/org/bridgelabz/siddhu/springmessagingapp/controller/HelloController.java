package org.bridgelabz.siddhu.springmessagingapp.controller;

import org.bridgelabz.siddhu.springmessagingapp.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String printer(){
        return "Hello !!!";
    }

    // Passing name as query parameter
    @GetMapping("/hello/query")
    public String sayHello(@RequestParam(name = "name", defaultValue = "Guest") String name){
        return "Hello "+name+" from BridgeLabz";
    }
    //passing name as path variable
    @GetMapping("hello/{name}")
    public String sayHelloUsingPathVariable(@PathVariable String name){
        return "Hello "+name+" from BridgeLabz";
    }
    // Post method
    @PostMapping("/hello/post")
    public String sayHelloUsingPost(@RequestBody User user){
        return "Hello "+user.getFirst_name()+" "+user.getLast_name()+" from BridgeLabz";
    }

}
