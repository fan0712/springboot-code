package cn.ys.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
//@TableName("t_user")
public class User {

//    表示使用自增  确定主键使用了自增才可使用
    @TableId(value = "uid",type = IdType.AUTO)
    private Long uid;
//数据库字段和实体类字段不一致时使用@TableField
    @TableField("user_name")
    private String name;
    private Integer age;
    private String email;

//    设置这个字段为逻辑删除字段
    @TableLogic
    private Integer isdel;
}
