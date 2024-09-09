package org.lai.springboot.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: zurichscud
 * @Date: 2024/9/5 下午11:09
 * @Description: TODO
 */

@ConfigurationProperties(value = "email")
@Component
@Data
public class EmailProperties {
    private String username;
    private String password;
    private String host;
    private String port;
}
