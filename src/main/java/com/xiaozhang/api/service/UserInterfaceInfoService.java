package com.xiaozhang.api.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaozhang.apiCommon.model.entity.UserInterfaceInfo;

/**
* @author 22603
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2023-07-01 19:02:58
*/
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {

    void validUserInterfaceInfo(UserInterfaceInfo interfaceInfo, boolean add);

    boolean invokeCount(long interfaceInfoId,int userId);
}
