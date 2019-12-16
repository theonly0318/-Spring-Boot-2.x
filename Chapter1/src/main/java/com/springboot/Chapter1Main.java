package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author guoshihua
 */
@Controller
// 启动Spring Boot 自动装配
@EnableAutoConfiguration
public class Chapter1Main {

    @RequestMapping("/test")
    @ResponseBody
    public Map<String, String> test(){
        Map<String, String> map = new HashMap<>();
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");
        map.put("key4","value4");
        return map;
    }

    public static void main(String[] args) {
        SpringApplication.run(Chapter1Main.class, args);
    }
}
