package com.springsecurity.springsecurity.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author BABA
 * @date 2019/10/10 16:30
 */
@RestController
public class HelloController {

//    @GetMapping
//    public String hello(){
//        return "hello";
//    }

//    @RestController
//    public class TestController {
//        @GetMapping("index")
//        public Object index(Authentication authentication) {
//            return authentication;
//        }
//    }
    @GetMapping("index")
    public Object index(){
        return SecurityContextHolder.getContext().getAuthentication();
    }
}
