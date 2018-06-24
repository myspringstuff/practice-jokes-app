package guru.springframework.controllers;

import guru.springframework.services.JokeTellingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private JokeTellingService service;

    public JokeController(JokeTellingService service) {
        this.service = service;
    }

    @RequestMapping({"/",""})
    public String getJoke(Model model) {
        model.addAttribute("joke", service.tellJoke());
        return "chucknorris";
    }
}
