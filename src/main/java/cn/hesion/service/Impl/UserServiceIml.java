package cn.hesion.service.Impl;

import cn.hesion.dao.IUserDao;
import cn.hesion.entity.User;
import cn.hesion.service.IUserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceIml implements IUserLoginService {
    @Autowired
    private IUserDao userDao;


    @Override
    public User doLogin(User user) {
        return userDao.doLogin(user);
    }
}
