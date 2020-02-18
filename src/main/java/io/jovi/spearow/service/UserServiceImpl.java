package io.jovi.spearow.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.jovi.spearow.entity.User;
import io.jovi.spearow.repository.UserRepository;
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
public class UserServiceImpl  extends ServiceImpl<UserRepository, User> implements UserService{
}
