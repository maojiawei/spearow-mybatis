package io.jovi.spearow.repository;

import io.jovi.spearow.entity.User;
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
public interface UserMapper {
    /**
     * 根据ID查询
     * @param id
     * @return
     */
    User findById(Long id);
}
