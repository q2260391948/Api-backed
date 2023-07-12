package com.xiaozhang.api.service.impl.inner;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xiaozhang.api.common.ErrorCode;
import com.xiaozhang.api.exception.BusinessException;
import com.xiaozhang.api.mapper.UserMapper;
import com.xiaozhang.apiCommon.model.entity.User;
import com.xiaozhang.apiCommon.service.InnerUserService;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * @author:22603
 * @Date:2023/7/11 15:36
 */

@DubboService
public class InnerUserServiceImpl implements InnerUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User getInvokeUser(String accessKey) {
       if (StringUtils.isAnyBlank(accessKey)){
           throw new BusinessException(ErrorCode.PARAMS_ERROR);
       }
        QueryWrapper<User>queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("accessKey",accessKey);
        return userMapper.selectOne(queryWrapper);
    }
}
