package com.example.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainCotroller {
  @GetMapping("/hello")
  public String helloWorld() {

    return "Hello World4";
  }
}
