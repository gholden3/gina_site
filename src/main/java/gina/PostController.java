package gina;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@Controller
@RequestMapping("/post")
class PostController {

    private final PostRepository postRepository;

    @Autowired
    PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @GetMapping("/{postId}")
    public String getPost(@PathVariable Long postId, Model model) {
        Optional<Post> postOptional = this.postRepository.findById(postId);
        Post post;
        if(postOptional.isPresent()){
            post = postOptional.get();
        } else {
            return "";
        }
        model.addAttribute("post", post);
        return "post";
    }

//    @PostMapping
//    public String createUser(@ModelAttribute User user) {
//        userRepository.save(user);
//        return "redirect:/users";
//    }

//    @GetMapping(value = "/new")
//    public String newUser(Model model) {
//        model.addAttribute("user", new User());
//        return "newUser";
//    }
}