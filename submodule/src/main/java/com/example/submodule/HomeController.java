package com.example.submodule;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Value("${ex.hh}")
    private String val;
    @GetMapping("")
    public String getHome(){
        return val;
    }


}
