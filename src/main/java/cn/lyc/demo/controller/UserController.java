package cn.lyc.demo.controller;

import cn.lyc.demo.bean.User;
import cn.lyc.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("")
    public Object add(@RequestBody User user) {
//        if (userService.findByName(user.getName()) != null) {
//            JSONObject jsonObject = new JSONObject();
//            jsonObject.put("message","用户名已被使用");
//            return jsonObject;
//        }
        return userService.add(user);
    }
}
