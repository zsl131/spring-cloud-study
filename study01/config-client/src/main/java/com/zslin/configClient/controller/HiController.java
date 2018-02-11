package com.zslin.configClient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Value("${foo}")
    String foo="placeholder";

    @GetMapping(value = "hi")
    public String hi() {
        return foo;
    }
}
