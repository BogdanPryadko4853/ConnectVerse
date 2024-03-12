package org.lconnectverse.controllers;

import lombok.RequiredArgsConstructor;
import org.lconnectverse.entity.User;
import org.lconnectverse.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class UsersController {

   private final UserService userService;


    @GetMapping
    public String getMainView(Model model) {
        List<User> users = userService.getUsers();
            model.addAttribute("users", users);
            return "HTML/users";
    }

    @GetMapping("/create")
    public String createUser(){
        return "HTML/create";
    }

    @GetMapping("/login")
    public String login(){
        return "HTML/login";
    }
}
