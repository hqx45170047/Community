package com.doroshi.hqx.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author hqx
 * @date 2020/2/24 - 21:23
 */
/*Controller注解可以自动识别扫描这个类，把它作为Spring的一个bean去管理
**同时也识别他为一个Controller，允许这个类接收前段的请求
  */

@Controller
public class HelloController {
    @GetMapping("/hello")
    public  String hello(@RequestParam(name ="name") String name,Model model){
        model.addAttribute("name",name);
        return "hello";
    }
}
