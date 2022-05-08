package com.atguigu.mybatisplus.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.*;

@Data
//@TableName("user")
public class User {
    @TableId(value = "uid",type = IdType.AUTO)
    private Long id;
    @TableField("user_name")
    private String name;
    private Integer age;
    private String email;
//    @TableLogic 逻辑删除字段
}
