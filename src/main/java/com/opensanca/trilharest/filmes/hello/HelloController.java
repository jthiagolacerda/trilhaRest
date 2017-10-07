package com.opensanca.trilharest.filmes.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jesus on 07/10/2017.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(path="", method = {RequestMethod.GET})
    public String hello(){
        return "Hello";
    }

}
