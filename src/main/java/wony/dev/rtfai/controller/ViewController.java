package wony.dev.rtfai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/")
    public String helloWorld(Model model){
        model.addAttribute("message", "Hello World!");
        return "index";
    }

    @GetMapping("/rta")
    public String rta(Model model){
        return "rta/tables";
    }
}
