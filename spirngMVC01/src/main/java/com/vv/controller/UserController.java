package com.vv.controller;

import com.vv.entity.Account;
import com.vv.entity.Team;
import com.vv.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/param1")
    public String param1(User user){
        System.out.println(user);

        return "success";
    }
    @RequestMapping("/param2")
    public String param2(Account account){
        System.out.println(account);
        return "success";
    }
    @RequestMapping("/param3")
    public String param3(Team team){
        System.out.println(team);
        return "success";
    }
}
