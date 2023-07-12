package com.xiaozhang.api.service.impl.inner;

import com.xiaozhang.api.common.ErrorCode;
import com.xiaozhang.api.exception.BusinessException;
import com.xiaozhang.api.service.UserInterfaceInfoService;
import com.xiaozhang.apiCommon.model.entity.UserInterfaceInfo;
import com.xiaozhang.apiCommon.service.InnerUserInterfaceInfoService;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * @author:22603
 * @Date:2023/7/11 15:35
 */
@DubboService
public class InnerUserInterfaceInfoServiceImpl implements InnerUserInterfaceInfoService {

    @Resource
    private UserInterfaceInfoService userInterfaceInfoService;

    @Override
    public boolean invokeCount(long interfaceInfoId, int userId) {
        return userInterfaceInfoService.invokeCount(interfaceInfoId, userId);
    }
}
