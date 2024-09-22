package study.dockerpractice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

    @GetMapping("/docker-test")
    public String getDocker(){
        return "Hello Docker!";
    }
}
