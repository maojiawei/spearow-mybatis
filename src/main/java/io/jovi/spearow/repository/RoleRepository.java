package io.jovi.spearow.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.jovi.spearow.entity.RoleDO;
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
public interface RoleRepository extends BaseMapper<RoleDO> {
    /**
     *
     * 分页查询
     *
     * @param page 分页对象
     * @param roleNo 角色编号
     * @return 分页对象
     */
    IPage<RoleDO> pagingBy(Page<?> page, String roleNo);
}
