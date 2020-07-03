package gina;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/post")
class PostController {

    @GetMapping("/{postId}")
    public String getPost(@PathVariable Long postId) {
        return "blogpost" + postId;
    }
}