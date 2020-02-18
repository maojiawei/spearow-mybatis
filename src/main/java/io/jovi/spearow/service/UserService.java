package io.jovi.spearow.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import io.jovi.spearow.entity.UserDO;

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
public interface UserService extends IService<UserDO> {
    /**
     *
     * 分页查询
     *
     * @param page 分页对象
     * @param realName 真实姓名
     * @return 分页对象
     */
    IPage<UserDO> pagingBy(Page<?> page, String realName);
}
