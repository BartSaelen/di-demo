package be.project28.didemo.controllers;

import be.project28.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingService greetingServiceImpl; //property name matches bean name, so gets right one gets injected

    public String sayHello(){
        return greetingServiceImpl.sayGreeting();
    }

}
