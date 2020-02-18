package io.jovi.spearow.service.user;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.jovi.spearow.SpearowApplication;
import io.jovi.spearow.entity.UserDO;
import io.jovi.spearow.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
public class UserServiceTest {
    @Autowired
    private UserService service;

    @Test
    public void list(){
        List<UserDO> list = service.list();
        System.out.println(list);
    }

    @Test
    public void insert() {
        UserDO user = new UserDO();
        user.setUsername("ditto");
        user.setPassword("ditto");
        user.setRealName("ditto");
        boolean save = service.save(user);
    }

    @Test
    public void insertBatch() {
        List<UserDO> list = new ArrayList<>(10);
        for(int i=0;i<10;i++){
            UserDO user = new UserDO();
            user.setUsername("jovi");
            user.setPassword("bbb");
            user.setRealName("jovi");
            list.add(user);
        }

        boolean save = service.saveBatch(list);
    }

    @Test
    public void pagingBy() {
        Page<UserDO> page = new Page<>();
        page.setCurrent(0).setSize(10);
        IPage<UserDO> userPage = service.pagingBy(page,"dit");

        System.out.println(userPage.getRecords());
    }
}
