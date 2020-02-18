package com.edu.springbootdocker;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController
@RequestMapping("/rest")
public class HomeController {

    @GetMapping("/v1/hello")
    public ResponseEntity hello() {
        return ResponseEntity.ok("Salam");
    }

    @GetMapping("/v2/hello")
    public ResponseEntity helloV2() {
        return ResponseEntity.ok("Salam 2");
    }

    @GetMapping("/v3/hello")
    public ResponseEntity helloV3() {
        return ResponseEntity.ok("Salam 3");
    }

    @GetMapping("/v4/hello")
    public ResponseEntity helloV4() {
        return ResponseEntity.ok("Salam 4");
    }
}
