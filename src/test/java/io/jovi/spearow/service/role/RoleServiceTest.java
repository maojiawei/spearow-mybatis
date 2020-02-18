package io.jovi.spearow.service.role;

import io.jovi.spearow.SpearowApplication;
import io.jovi.spearow.entity.RoleDO;
import io.jovi.spearow.service.RoleService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,classes = {SpearowApplication.class})
public class RoleServiceTest {
    @Autowired
    private RoleService roleService;

    @Test
    public void insert() {
        RoleDO role = new RoleDO();
        role.setName("super admin");
        role.setRoleNo("admin");
        roleService.save(role);
    }
}
