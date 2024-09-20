package org.lai.springboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.lai.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: zurichscud
 * @Date: 2024/9/9 下午9:38
 * @Description: TODO
 */
@Slf4j
@RestController
@RequestMapping("/demo")
public class HelloController {
    @GetMapping("/get")
    public String get(@RequestParam("name") String username,
                      @RequestParam("pwd") String password) {
        System.out.println(username);
        System.out.println(password);
        log.error("成功访问");
        return "Hello, Spring Boot!";
    }

    @PostMapping("/post")
    public String post(@RequestParam("username") String username,
                       @RequestParam("password") String password,
                       @RequestParam("pageNum") Integer pageNum) {
        System.out.println(username);
        System.out.println(password);
        System.out.println(pageNum);
        return "Hello, Spring Boot!";
    }
    @PostMapping("/json")
    public String json(@RequestBody User user){
        System.out.println(user);
        return "success";
    }
    @PostMapping("/msg")
    public String msg(@RequestBody String msg){
        System.out.println(msg);
        return "success";
    }
}
