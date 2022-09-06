package com.xiaokaixin.wemedia.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaokaixin.model.common.dtos.ResponseResult;
import com.xiaokaixin.model.wemedia.dtos.WmLoginDto;
import com.xiaokaixin.model.wemedia.pojos.WmUser;

public interface WmUserService extends IService<WmUser> {

    /**
     * 自媒体端登录
     * @param dto
     * @return
     */
    public ResponseResult login(WmLoginDto dto);

}