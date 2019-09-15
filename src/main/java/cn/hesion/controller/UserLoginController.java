package cn.hesion.controller;

import cn.hesion.entity.User;
import cn.hesion.service.IUserLoginService;
import cn.hesion.utils.AjaxResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;
import java.util.List;

@RestController
@RequestMapping("/api/user")
@CrossOrigin
public class UserLoginController {
    @Autowired(required=true)
    private IUserLoginService userLoginService;
    @RequestMapping(value = "/login.do", method = RequestMethod.POST,consumes = {"application/JSON"})
    public AjaxResponse dologin(@RequestBody User user){
        System.out.println(user);
        User user1 = userLoginService.doLogin(user);
        System.out.println(user1);
        if(!(user1==null)) {
            return AjaxResponse.success(user1);
        }else{
            return AjaxResponse.fail(user1);
        }
    }
}
