package com.heima.model.user.dtos;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 用户登录Dto
 * @author unique
 */
@Data
public class LoginDto {

    /**
     * 手机号
     */
    @NotNull
    private String phone;

    /**
     * 密码
     */
    @NotNull
    private String password;
}
