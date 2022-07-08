package com.example.dockerDemo;

import org.apache.logging.log4j.status.StatusData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/v1")
public class Controller {
    @GetMapping("/get")
    public String getString()
    {
        return "hello docker";
    }
    @GetMapping(value="path")
    public String getMethodName(@RequestParam String param) {
        return "akhir";
    }
    
    
    
}
