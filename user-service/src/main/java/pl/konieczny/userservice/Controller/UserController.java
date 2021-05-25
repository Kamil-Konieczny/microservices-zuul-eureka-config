package pl.konieczny.userservice.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Value("${app.user}")
    private String appUser;

    @Value("${eureka.instance.instance-id}")
    private String serviceId;

    @GetMapping
    public String hello() {
        return "UserApi name: " + appUser+" app-id:"+serviceId;
    }

}
