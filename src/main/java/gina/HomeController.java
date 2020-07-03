package gina;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
class HomeController {


    @GetMapping("/")
    public String home(Model model) {
        return "index";
    }
}