package com.example.datacontainer.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@RestController
public class MainController {
    private static final Logger logger = LogManager.getLogger(MainController.class);

    @GetMapping(path = "/")
    public @ResponseBody String main() {
        logger.info("Main API");
        return "POS SYSTEM TALHA";
    }

    @GetMapping(path = "/i2c")
    public @ResponseBody String mainHeading() {
        logger.info("i2c API");
        return "Banking & Payments";
    }

    @GetMapping(path = "/mine")
    public @ResponseBody String mine() {
        return "Mine Code";
    }

    @GetMapping(path = "/name")
    public @ResponseBody String name(@RequestParam String name) {
        System.out.println("Name Detected: " + name );
        return "Hi, "+ name;
    }

    @GetMapping(path = "/hello/{name}")
    public String greet(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("/data/{id}")
    public ResponseEntity<String> getData(@PathVariable int id) {
        if (id < 0) {
            return new ResponseEntity<>("Invalid ID", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>("Data for ID: " + id, HttpStatus.OK);
    }

    @GetMapping("/item/{id}")
    public String getItem(@PathVariable int id) {
        if (id < 0) {
            throw new IllegalArgumentException("Invalid ID");
        }
        return "Item ID: " + id;
    }
}
