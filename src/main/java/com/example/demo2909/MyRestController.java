package com.example.demo2909;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MyRestController {

    @GetMapping("/hello")
    public String sayHello() {
        String message = "Hello, World!";
        System.out.println("Input: None");
        System.out.println("Output: " + message);
        return message;
    }

    @PostMapping("/greet")
    public String greet(@RequestParam String name) {
        String message = "Hello, " + name + "!";
        System.out.println("Input: " + name);
        System.out.println("Output: " + message);
        return message;
    }

    @GetMapping("/reverse")
    public String reverse(@RequestParam String text) {
        StringBuilder sb = new StringBuilder(text);
        String message = sb.reverse().toString();
        System.out.println("Input: " + text);
        System.out.println("Output: " + message);
        return message;
    }

    // operation to remove vowels from a string
    @GetMapping("/remove-vowels")
    public String removeVowels(@RequestParam String text) {
        String message = text.replaceAll("[aeiouAEIOU]", "");
        System.out.println("Input: " + text);
        System.out.println("Output: " + message);
        return message;
    }

}