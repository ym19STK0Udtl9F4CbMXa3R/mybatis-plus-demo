package cn.nines.mybatisplus.demo.sys.service.impl;

import cn.nines.mybatisplus.demo.sys.entity.User;
import cn.nines.mybatisplus.demo.sys.mapper.UserMapper;
import cn.nines.mybatisplus.demo.sys.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Nines
 * @since 2019-11-23
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
