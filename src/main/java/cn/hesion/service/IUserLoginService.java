package cn.hesion.service;

import cn.hesion.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IUserLoginService {
    public User doLogin(User user);
}
