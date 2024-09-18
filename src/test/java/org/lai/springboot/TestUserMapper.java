package org.lai.springboot;

import cn.hutool.core.util.StrUtil;
import cn.hutool.extra.spring.SpringUtil;
import cn.hutool.jwt.JWTUtil;
import org.junit.jupiter.api.Test;
import org.lai.springboot.config.EmailProperties;
import org.lai.springboot.mapper.UserMapper;
import org.lai.springboot.model.User;
import org.lai.springboot.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
public class TestUserMapper {

    @Resource
    private UserMapper userMapper;

    @Resource
    private UserService userService;

    @Test
    public void test1() {
        User user = new User();
        user.setName("lai");
        user.setPassword("123456");
        user.setOrder(1);
        userMapper.insert(user);
        System.out.println(userMapper.selectById("1"));
    }

    @Test
    public void test2() {
        System.out.println(StrUtil.isEmpty(""));
        EmailProperties emailProperties = SpringUtil.getBean("emailProperties");
        String password = emailProperties.getPassword();
        System.out.println(password);
    }

    @Test
    public void test3() throws UnsupportedEncodingException {
        String str = "你好，世界！";
        byte[] byteArray = str.getBytes(StandardCharsets.UTF_8);  // 指定使用 UTF-8 字符编码
        System.out.println(Arrays.toString(byteArray));//[-28, -67, -96, -27, -91, -67, -17, -68, -116, -28, -72, -106, -25, -107, -116, -17, -68, -127]
    }

    @Test
    public void test4() {
        Map<String,Object> hashMap = new HashMap<>();
        hashMap.put("username","lai");
        String token = JWTUtil.createToken(hashMap, "123456".getBytes());
        System.out.println(token);
    }

    @Test
    public void test5() {
//     userService.saveBatch()
    }

}
