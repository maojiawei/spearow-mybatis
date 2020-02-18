package io.jovi.spearow.service.user;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.jovi.spearow.SpearowApplication;
import io.jovi.spearow.entity.User;
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
        List<User> list = service.list();
        System.out.println(list);
    }

    @Test
    public void insert() {
        List<User> list = new ArrayList<>(10);
        for(int i=0;i<10;i++){
            User user = new User();
            user.setUsername("jovi");
            user.setPassword("bbb");
            user.setRealName("jovi");
            user.setCreateDate(new Date());
            list.add(user);
        }

        boolean save = service.saveBatch(list);
    }

    @Test
    public void pagingBy() {
        Page<User> page = new Page<>();
        page.setCurrent(0).setSize(10);
        IPage<User> userPage = service.pagingBy(page,null);

        System.out.println(userPage.getRecords());
    }
}
