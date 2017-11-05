package com.spring.day01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/spring/test")
public class TestController
{
    public TestController()
    {
        // springMVC容器在初始化过程中，根据配置的包扫描路径，利用反射机制获取Controller上面的URL
        System.out.printf("Constroctor is running,,,,");
    }
    @RequestMapping("/day01")
    private String test()
    {
        return "success";
    }
}
