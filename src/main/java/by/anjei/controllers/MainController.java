package by.anjei.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String sayDefault() {
        return "index";
    }

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String sayGreeting(Model model) {
        model.addAttribute("greeting", "Greeting from Anjei");
        return "greeting";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello(Model model) {
        model.addAttribute("hello", "Hello from Anjei");
        return "hello";
    }

}
