package ru.kata.spring.boot_security.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping("/")
public class UserController {

//    private final UserService userService;
//
//    @Autowired
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }

    @GetMapping("/login")
    public String loginPage() {
        return "loginPage";
    }

    @GetMapping("/user")
    public String showUser(Model model, Principal principal) {
//        User user = userService.findUserByUsername(principal.getName());
//        model.addAttribute("user", userService.getUser(user.getId()));
//        System.out.println("Успешно: user id" + user.getClass());
//        model.addAttribute("titleTable", "Страница пользователя: ");
        return "user";

    }
}
