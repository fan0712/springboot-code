package cn.ys.mapper;

import cn.ys.pojo.Books;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface BooksMapper extends BaseMapper<Books> {
}
