package app.controller;

import app.entity.User;
import app.Application;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * http://localhost:8080/users
 */


@RestController
public class UserController {

    @GetMapping("/users")
    public List<User> btdf () {
        return Arrays.asList(
                new User("Jim"),
                new User("John"));
    }

}
