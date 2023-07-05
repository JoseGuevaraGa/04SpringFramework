package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class HelloWorldController {
    public static void main(String[] args) {
        SpringApplication.run(com.example.demo.HelloWorldController.class, args);
    }
    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(value = "nom", defaultValue = "UNKNOWN") String name) {
        return String.format("Hello %s!", name, "Estas ejecutando un proyecto Maven");
    }
    @GetMapping("/HelloWorld2")
    public String saluda2n(@RequestParam(value = "nom", defaultValue = "UNKNOWN") String name) {
        return String.format("Hello %s!", name, "Estas ejecutando un proyecto Maven");
    }
    @GetMapping("/HelloWorld2/{nom}")
    @ResponseBody
    public String saluda2(@PathVariable String nom) {
        return "Hello " + nom + " Estas ejecutando un proyecto Maven";
    }

}