package com.sunline.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "web")
@Component("appConfig")
@PropertySource("classpath:config/app.properties")
public class AppConfig {

    private String checkPath;

    public String getCheckpath() {
        return checkPath;
    }

    public void setCheckpath(String checkPath) {
        this.checkPath = checkPath;
    }
}
