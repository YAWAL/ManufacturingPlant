package com.manufacturingplant.smes.controllers;

import com.manufacturingplant.smes.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by VYA on 09.06.2016.
 */
@Controller
public class UsersController {

    @Autowired
    private UsersService usersService;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    private String newUser(Model model){
        model.addAttribute("user", new Users());
        return "registration";
    }

    @RequestMapping(value = "/createNewUser", method = RequestMethod.POST)
    private String createNewUser(@ModelAttribute Users users){
        usersService.addUser(users);
        return "redirect:/";
    }

    @RequestMapping(value = "/myCabinet={id}", method = RequestMethod.GET)
    public String myStringcabinet(@PathVariable String id, Model model){
        model.addAttribute("page", usersService.findUserById(Integer.parseInt(id)));
        return "user";
    }

    @RequestMapping(value = "/loginpage")
    public String login(){
        return "login";
    }



}
