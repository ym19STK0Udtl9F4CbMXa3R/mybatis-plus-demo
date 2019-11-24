package cn.nines.mybatisplus.demo.pagination.service;

import cn.nines.mybatisplus.demo.pagination.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Nines
 * @since 2019-11-23
 */
public interface UserService extends IService<User> {

    Map findPage(String name, int current, int size);

}
