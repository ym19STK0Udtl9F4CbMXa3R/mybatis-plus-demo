package cn.nines.mybatisplus.demo.pagination.service.impl;

import cn.nines.mybatisplus.demo.pagination.entity.User;
import cn.nines.mybatisplus.demo.pagination.mapper.UserMapper;
import cn.nines.mybatisplus.demo.pagination.service.UserService;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

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

    @Resource
    private UserMapper userMapper;

    @Override
    public Map findPage(String name, int current, int size){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.like("name", name);

        Page<User> page = new Page<>(current, size);

        IPage<User> iPage = userMapper.selectPage(page, wrapper);

        Map<String, Object> map = new HashMap<>();
        map.put("pages", iPage.getPages());
        map.put("total", iPage.getTotal());
        map.put("records", iPage.getRecords());

        return map;
    }

}
