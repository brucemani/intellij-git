package com.bruce.api.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.ResponseEntity.ok;

/**
 * @Author: kchid
 * @Project: Git_practice
 * @Date: 12/31/2023
 * @Time: 8:10 PM
 */
@RestController
@AllArgsConstructor
@RequestMapping(path = "/api")
public class AppController {
    

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<?> show() {
        return ok("Hello mani");
    }
}
