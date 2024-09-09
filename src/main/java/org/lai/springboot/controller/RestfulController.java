package org.lai.springboot.controller;

import org.lai.springboot.model.User;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: zurichscud
 * @Date: 2024/9/9 下午9:38
 * @Description: TODO
 */
@RestController
@RequestMapping("/rest")
public class RestfulController {
    @PostMapping("/post/{pageNum}")
    public String msg(@RequestBody String msg,@PathVariable String pageNum) {
        System.out.println(msg);
        System.out.println(pageNum);
        return "success";
    }
}
