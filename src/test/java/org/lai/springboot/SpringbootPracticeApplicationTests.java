package org.lai.springboot;

import org.junit.jupiter.api.Test;
import org.lai.springboot.config.EmailProperties;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SpringbootPracticeApplicationTests {

    @Resource
    private EmailProperties emailProperties;
    @Test
    void contextLoads() {
        System.out.println(emailProperties);
    }

}
