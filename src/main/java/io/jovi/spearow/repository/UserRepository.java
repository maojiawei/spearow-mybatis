package io.jovi.spearow.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.jovi.spearow.entity.UserDO;
import org.springframework.stereotype.Repository;

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
@Repository
public interface UserRepository extends BaseMapper<UserDO> {
    /**
     *
     * 查询 : 根据state状态查询用户列表，分页显示
     *
     * @param page 分页对象,xml中可以从里面进行取值,传递参数 Page 即自动分页,必须放在第一位(你可以继承Page实现自己的分页对象)
     * @param realName 真实姓名
     * @return 分页对象
     */
    IPage<UserDO> pagingBy(Page<?> page, String realName);

}
