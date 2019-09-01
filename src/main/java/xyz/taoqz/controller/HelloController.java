package xyz.taoqz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author :almostTao
 * @date :Created in 2019/8/31 18:28
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String fun(Model model){
        model.addAttribute("hello","hello thymeleaf");
        return "index";
    }

    @RequestMapping("/content")
    public String content(Model model){
        return "content";
    }

    @RequestMapping("/header")
    public String header(Model model){
        return "header";
    }

    @RequestMapping("/url")
    public String url(Model model){
        model.addAttribute("baidu","https://www.baidu.com");
        return "url";
    }
}
