package com.xiaokaixin.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaokaixin.model.common.dtos.ResponseResult;
import com.xiaokaixin.model.user.dtos.LoginDto;
import com.xiaokaixin.model.user.pojos.ApUser;

public interface ApUserService extends IService<ApUser> {
    /**
     * app端登录功能
     * @param dto
     * @return
     */
    public ResponseResult login(LoginDto dto);
}
