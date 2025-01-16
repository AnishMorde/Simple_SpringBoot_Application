package org.example.helloworld;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class HelloWorldController {

    private List<String> users = new ArrayList<>();

    @GetMapping
    public List<String> getAllUsers() {
        return users;
    }

    @PostMapping
    public String addUser(@RequestBody String user) {
        users.add(user);
        return "User added successfully!";
    }
}
