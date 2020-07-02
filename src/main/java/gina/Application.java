package gina;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @Bean
    public CommandLineRunner demo(PostRepository repository) {
        return (args) -> {
            repository.save(new Post("post1title", "post1headline", "<div>hi!</div>"));
            repository.save(new Post("post2title", "post2headline", "<div>hello</div>"));
            repository.save(new Post("post3title", "post3headline", "<div>hi</div>"));

        };
    }

}