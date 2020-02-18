package io.jovi.spearow.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.jovi.spearow.entity.User;
import io.jovi.spearow.repository.UserRepository;
import io.jovi.spearow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * Title:
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: Copyright (c) 2019
 * </p>
 *
 * @author Jovi
 * @version 1.0
 */
@Service
public class UserServiceImpl  extends ServiceImpl<UserRepository, User> implements UserService {
    @Autowired
    private UserRepository repository;
    /**
     * 查询 : 根据state状态查询用户列表，分页显示
     *
     * @param page     分页对象,xml中可以从里面进行取值,传递参数 Page 即自动分页,必须放在第一位(你可以继承Page实现自己的分页对象)
     * @param realName 真实姓名
     * @return 分页对象
     */
    @Override
    public IPage<User> pagingBy(Page<?> page, String realName) {
        return repository.pagingBy(page, realName);
    }
}
