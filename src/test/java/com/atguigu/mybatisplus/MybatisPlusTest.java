package com.atguigu.mybatisplus;

import com.atguigu.mybatisplus.mapper.UserMapper;
import com.atguigu.mybatisplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Test
    public void testInsert(){
        User user = new User();
        user.setName("张三");
        user.setAge(18);
        user.setEmail("zhangsan@qq.com");
        int insert = userMapper.insert(user);
        System.out.println("result:"+insert);
        System.out.println("id:"+user.getId());
    }

    @Test
    public void testDelete(){
//        int result = userMapper.deleteById(1523141204237914114L);
        /*Map<String,Object>map = new HashMap<>();
        map.put("name","张三");
        map.put("age","23");
        int result = userMapper.deleteByMap(map);*/
        List<Long> list = Arrays.asList(1L, 2L, 3L);
        int result = userMapper.deleteBatchIds(list);
        System.out.println("result:"+result);
    }

    @Test
    public void testUpdate(){
        User user = new User();
        user.setId(4L);
        user.setName("李四");
        user.setEmail("lisi@qq.com");
        int result = userMapper.updateById(user);
        System.out.println("result:"+result);
    }

    @Test
    public void testSelect(){
        User user = userMapper.selectById(1L);
        System.out.println(user);
    }
}
