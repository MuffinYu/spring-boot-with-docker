package com.example.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@SpringBootApplication
public class DockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerApplication.class, args);
    }

    @RequestMapping("/")
    @ResponseBody
    Map index () {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("status", "true");
        map.put("message", "sever is running");
        map.put("data", "");
        return map;
    }

}
