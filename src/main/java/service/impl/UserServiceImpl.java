package service.impl;

import com.atguigu.mybatisplus.mapper.UserMapper;
import com.atguigu.mybatisplus.pojo.User;
import org.springframework.stereotype.Service;
import service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.*;

/**
 * @author: zjh
 * @Pcakage: service.impl.ServiceImpl
 * @Date: 2022年05月08日 11:57
 * @Description:
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
