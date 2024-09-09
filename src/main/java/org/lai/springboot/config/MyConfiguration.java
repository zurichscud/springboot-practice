package org.lai.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: zurichscud
 * @Date: 2024/9/6 下午8:06
 * @Description: TODO
 */
@Configuration
public class MyConfiguration {

    @Bean
    public EmailProperties userService() {
        return new EmailProperties();
    }

}
