package com.coderclay.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import java.io.IOException;
import java.util.Collection;

@RestController
public class DemoController {

    @PostMapping(value = "/test")
    public ResponseEntity<String> test(HttpServletRequest httpServletRequest) throws IOException, ServletException {
//        Collection<Part> parts = httpServletRequest.getParts();
        return ResponseEntity.ok("ok");
    }
}
