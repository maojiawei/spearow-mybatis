package io.jovi.spearow.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.jovi.spearow.entity.RoleDO;
import io.jovi.spearow.repository.RoleRepository;
import io.jovi.spearow.service.RoleService;
import org.apache.ibatis.annotations.Select;
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
public class RoleServiceImpl extends ServiceImpl<RoleRepository, RoleDO> implements RoleService {
    @Autowired
    private RoleRepository repository;

    /**
     * 分页查询
     *
     * @param page   分页对象
     * @param roleNo 角色编号
     * @return 分页对象
     */
    @Override
    public IPage<RoleDO> pagingBy(Page<?> page, String roleNo) {
        return repository.pagingBy(page, roleNo);
    }

    /**
     * 根据角色编号查询
     *
     * @param roleNo 角色编号
     * @return
     */
    @Override
    public RoleDO findByRoleNo(String roleNo) {
        return repository.findByRoleNo(roleNo);
    }
}
