package be.intec.lesJS.demo.controllers;

import be.intec.lesJS.demo.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
/*        model.addAttribute("title", "Главная страница");
        Post post = new Post();
        post.setTitle("PostNo1");
        post.setFull_text("Here is the text");
        post.setViews(20);
        post.setAnons("Anons");

        model.addAttribute("Post1", post);*/

        return "home";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "Страница о нас");
        return "about";
    }

}