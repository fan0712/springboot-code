package cn.ys.mapper;

import cn.ys.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {

    @Select("select * from  user  where id =#{id}}")
    User getUserById(Long id);
}
