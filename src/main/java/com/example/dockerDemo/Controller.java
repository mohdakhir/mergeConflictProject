package com.example.dockerDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class Controller {
    @GetMapping("/get")
    public String getString()
    {
        return "hello docker";
    }

    @GetMapping("/{id}")
    public String getById(@PathVariable Long id){
        return "get Data by Id";
    }
    
}
