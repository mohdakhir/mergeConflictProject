package com.example.dockerDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v1")
public class Controller {
    @GetMapping("/get")
    public String getString()
    {
        return "hello docker";
    }
    
   

    @GetMapping(value="path")
    private String getMethodName(@RequestParam String param) {
        return "akhir";
    }

    @GetMapping(value="path")
    private String getMethod(@RequestParam String param) {
        return "akhir";
    }
    
    
    
}
