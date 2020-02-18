package io.jovi.spearow.service.user;

import io.jovi.spearow.SpearowApplication;
import io.jovi.spearow.entity.User;
import io.jovi.spearow.repository.UserRepository;
import io.jovi.spearow.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
}
