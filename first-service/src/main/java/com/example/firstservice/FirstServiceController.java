package com.example.firstservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/first-service/")
public class FirstServiceController {

    @GetMapping("/welcome")
    public String welcome(){
        return "welcome to the first service";
    }

    @GetMapping("/message")
    public String welcome(@RequestHeader("first-request") String header){
        log.info(header);
        return "hello world in first service";
    }

    @GetMapping("/check")
    public String check() {
        return "Hi, there. This is a Message from First Service";
    }
}
