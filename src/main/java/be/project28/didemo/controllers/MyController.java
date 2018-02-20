package be.project28.didemo.controllers;

import be.project28.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("Hello!!");

        return greetingService.sayGreeting();
    }
}

