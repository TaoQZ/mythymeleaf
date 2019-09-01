package xyz.taoqz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author :almostTao
 * @date :Created in 2019/9/1 0:39
 */
@Controller
public class IfController {

    @RequestMapping("/if")
    public String if_unless(Model model){
        model.addAttribute("age",18);
        return "if";
    }

}
