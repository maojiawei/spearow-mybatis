package io.jovi.spearow.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.jovi.spearow.entity.UserDO;
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
public class UserServiceImpl  extends ServiceImpl<UserRepository, UserDO> implements UserService {
    @Autowired
    private UserRepository repository;
    /**
     * 分页查询
     *
     * @param page     分页对象
     * @param realName 真实姓名
     * @return 分页对象
     */
    @Override
    public IPage<UserDO> pagingBy(Page<?> page, String realName) {
        return repository.pagingBy(page, realName);
    }
}
