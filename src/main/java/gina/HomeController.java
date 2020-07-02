package gina;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
class HomeController {

    private final PostRepository postRepository;

    @Autowired
    HomeController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @GetMapping("/")
    public String home(Model model) {
        Collection<Post> posts = this.postRepository.findAll();
        model.addAttribute("posts", posts);
        return "index";
    }
}