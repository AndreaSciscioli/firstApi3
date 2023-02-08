package co.develhope.firstapi3.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/strings")
public class StringController {
    @GetMapping
    public String stringConcatenation(@RequestParam String s1, String s2){
        if(s2 != null){
            return s1 + " " + s2;
        } else return s1;

    }

}
