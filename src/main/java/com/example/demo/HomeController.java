package com.example.demo;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class HomeController {

    @GetMapping("/home/{name}")
    public String home(@PathVariable String name){
        log.info("Request with name {}", name);
        return "Home " + name;
    }

    @GetMapping("/{name}")
    public ResponseEntity<String> hello(@PathVariable String name){
        log.info("Request with name {}", name);
        return ResponseEntity.ok("This is app Demo from K8s for" + name + " updated updated1 updated2 NEW BUILD CI CD");
    }

}