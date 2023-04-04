package stackspringboot.fullstackbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import stackspringboot.fullstackbackend.model.User;
import stackspringboot.fullstackbackend.repository.UserRepository;

@RestController

public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("api/v1/create")
    User newUser(@RequestBody User newUser){
        return userRepository.save(newUser);

    }


}
