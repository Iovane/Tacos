package sia.tacocloud.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.support.SessionStatus;

@Slf4j
@Controller
public class HomeController {

    @GetMapping
    public String home(){
        return "home";
    }

    @GetMapping("/other")
    public String other(){
        return "other";
    }

    @PostMapping
    public String designTaco(){
        log.info("Designing your Tacos");

        return "redirect:/design";
    }

}
