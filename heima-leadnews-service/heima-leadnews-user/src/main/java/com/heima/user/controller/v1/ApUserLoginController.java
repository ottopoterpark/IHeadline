package com.heima.user.controller.v1;

import com.heima.model.common.dtos.ResponseResult;
import com.heima.model.user.dtos.LoginDto;
import com.heima.user.service.ApUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * app端用户登录
 * @author unique
 */
@RestController
@RequestMapping("/api/v1/login")
@RequiredArgsConstructor
public class ApUserLoginController {

    private final ApUserService apUserService;

    /**
     * 用户登录
     * @param dto
     * @return
     */
    @PostMapping("/login_auth")
    public ResponseResult login(@RequestBody LoginDto dto){
        return apUserService.login(dto);
    }
}
