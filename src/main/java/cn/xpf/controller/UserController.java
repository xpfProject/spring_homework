package cn.xpf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/4/2.
 */
@RestController
public class UserController {

    @RequestMapping("/login")
    public String login(){
        System.out.println("login");
        return "login";
    }
}
