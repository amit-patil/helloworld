package com.example.helloworld;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloWorldController {
    @Value("${helloworld.message}")
    public String message;

    @GetMapping("/hello")
    public ResponseEntity<String> getHello(){
        log.info("Called Hello World Control");
        return ResponseEntity.ok().body("Google Cloud Platform Says " + message);
    }
}
