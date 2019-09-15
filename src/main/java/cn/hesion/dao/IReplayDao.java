package cn.hesion.dao;

import cn.hesion.entity.Reply;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IReplayDao {


    @Select("SELECT * from reply WHERE Invid = #{invId}")
    @Results(
            @Result(property = "user",
                    column = "replyerid",
                    one = @One(select = "cn.hesion.dao.IUserDao.getUser")))
    public List<Reply> getReplybyInvId(@Param("invId") Long id);
}
