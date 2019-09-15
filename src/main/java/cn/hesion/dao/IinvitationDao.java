package cn.hesion.dao;

import cn.hesion.entity.Invitation;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface IinvitationDao {
    @Insert("INSERT invitation ")
    public void pushInv(@Param("invitation") Invitation invitation);

    @Select("SELECT * FROM invitation")
    public List<Invitation> getInv();
    @Select("SELECT * FROM invitation WHERE type = #{type}")
    public List<Invitation> getInvByType(@Param("type") String type);

    @Select("SELECT * FROM invitation WHERE id = #{id}")
    List<Invitation> getInvdetialById(@Param("id") long id);
}
