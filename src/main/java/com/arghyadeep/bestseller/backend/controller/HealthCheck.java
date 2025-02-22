package com.arghyadeep.bestseller.backend.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/health")
public class HealthCheck {
    @GetMapping("/{path}")
    public String isRunning(@RequestParam String serv , @PathVariable String path) {
        return serv + "Status: OK \n path: " + path;
    }



}

