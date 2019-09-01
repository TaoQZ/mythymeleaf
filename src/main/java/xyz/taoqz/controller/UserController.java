package xyz.taoqz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import xyz.taoqz.domain.User;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author :almostTao
 * @date :Created in 2019/8/31 23:26
 */
@Controller
public class UserController {

    @RequestMapping("/user")
    public String user(Model model){
        model.addAttribute("user",new User(null));
        model.addAttribute("html","<font color='red'>user</font>");
        return "user";
    }

    @RequestMapping("/users")
    public String users(Model model){
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("zhangsan",1));
        users.add(new User("lisi",2));
        users.add(new User("wangwu",3));
        model.addAttribute("users",users);
        return "users";
    }

    @RequestMapping("/map")
    public String map(Model model){
        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put("张三",new User("zhangsan",1));
        hashMap.put("李四",new User("lisi",2));
        hashMap.put("王五",new User("wangwu",3));
        model.addAttribute("map",hashMap);
        return "map";
    }

}
