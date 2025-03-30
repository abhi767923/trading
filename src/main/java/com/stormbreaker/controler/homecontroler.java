package com.stormbreaker.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homecontroler {

    @GetMapping
    public String home() {
        return  "welcome  to trading platform";
    }
}
