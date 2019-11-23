package cn.nines.mybatisplus.demo.quickly.dao;

import cn.nines.mybatisplus.demo.quickly.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;


/**
 * @ClassName: UserMapper
 * @Description: UserMapper接口
 * @author: Nines
 * @date: 2019年11月21日 22:12
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
}
