package com.dy.tb.mapper;

import com.dy.tb.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from user")
    @Results({
            @Result(property = "name", column = "name")
    })
    List<User> getAll();

    @Select("select * from user where id=#{id}")
    User getById(Long id);

    @Insert({"insert into user(name,age,pwd) values(#{name},#{age},#{pwd})"})
    void install(User user);

    @Update({"update user set name=#{name} where id=#{id}"})
    void Update(User user);

    @Delete("delete from user where id=#{id}")
    void delete(Long id);
}
