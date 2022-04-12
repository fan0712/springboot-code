package cn.ys.mapper;

import cn.ys.pojo.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
public interface BookMapper {

    @Select("select * from  books where id = #{id}")
    Book selectBookById(Integer id);
}
