package com.xiaozhang.api.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaozhang.apiCommon.model.entity.InterfaceInfo;

/**
* @author 22603
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-07-01 19:02:58
*/
public interface InterfaceInfoService  extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);

}
