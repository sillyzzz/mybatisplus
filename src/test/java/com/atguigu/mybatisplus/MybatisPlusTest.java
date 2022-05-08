package com.atguigu.mybatisplus;

import com.atguigu.mybatisplus.mapper.UserMapper;
import com.atguigu.mybatisplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author: zjh
 * @Pcakage: com.atguigu.mybatisplus.MybatisPlusTest
 * @Date: 2022年05月08日 10:33
 * @Description:
 */
@SpringBootTest
public class MybatisPlusTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelectList(){
        List<User> list = userMapper.selectList(null);
        list.forEach(System.out::println);
    }
}
