package com.sunline.practice.L20190923;


import com.sunline.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/properties")
public class Properties {

    @Value("${app.creator}")
    private String creator;

    @Value("${app.name}")
    private String name;

    @Autowired
    private Environment env;

    @Autowired
    private AppConfig appConfig;

    @RequestMapping("/test")
    public void test () {
        System.out.println("creator======>"+creator);
        System.out.println("name======>"+name);
        System.out.println("creator======>"+env.getProperty("app.creator")+",name======>"+env.getProperty("app.name"));
        System.out.println("web======>"+appConfig.getCheckpath());
    }
}
