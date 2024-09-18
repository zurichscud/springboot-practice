package org.lai.springboot;

import cn.hutool.extra.spring.SpringUtil;
import org.lai.springboot.config.MyConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Import;

@SpringBootApplication
//@EnableConfigurationProperties(MyConfiguration.class)
@MapperScan(basePackages = "org.lai.springboot.mapper")
@Import(SpringUtil.class)
public class SpringbootPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootPracticeApplication.class, args);
    }

}
