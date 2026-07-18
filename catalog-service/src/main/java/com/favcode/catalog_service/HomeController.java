package com.favcode.catalog_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public UserRecord home() {
        return new UserRecord("Kanaiya", "kanaiya@gmail.com");
    }
}
