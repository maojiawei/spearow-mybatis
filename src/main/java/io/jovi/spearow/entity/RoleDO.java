package io.jovi.spearow.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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
@Getter
@Setter
@ToString
@NoArgsConstructor
@TableName("spearow_role")
public class RoleDO extends AbstractBaseDO {
    /**
     * 物理主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;
    /**
     * 角色编号
     */
    @TableField(value = "role_no")
    private String roleNo;
    /**
     * 密码
     */
    @TableField(value = "name")
    private String name;
}
