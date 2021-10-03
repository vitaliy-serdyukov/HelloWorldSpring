package com.example.helloworldspring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringController {

    @GetMapping ("/hello")
  public String helloWorld() {
      return "Hello World";
  }

  @GetMapping ("/parameter")
  //localhost:8080/parameter?input=name
  // f.eks. http://localhost:8080/parameter?name=Dat21v1
  public String parameter (@RequestParam String name) {
    return "Hello, " + name + "!";
  }
}



