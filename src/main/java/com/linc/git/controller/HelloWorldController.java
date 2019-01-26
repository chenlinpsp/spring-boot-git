package com.linc.git.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Aurthor chenl on 2019/1/26
 */
@RestController
public class HelloWorldController {

    @GetMapping("/get")
    public String helloWorld() {
        return "helloWorld";
    }
}
