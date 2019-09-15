package cn.hesion.dao;

import cn.hesion.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface IUserDao {
    /**
     * 用户登录
     */
    @Select("select id,username,registertime from user where username = #{user.username} AND password = #{user.password}")
    public User doLogin(@Param("user") User user);
}
