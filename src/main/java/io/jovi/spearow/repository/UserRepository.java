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
     * 分页查询
     *
     * @param page 分页对象
     * @param realName 真实姓名
     * @return 分页对象
     */
    IPage<UserDO> pagingBy(Page<?> page, String realName);

}
