package com.monster.common.service;

import com.monster.common.model.entity.UserInterfaceInfo;

/**
* @author Sherlno
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2023-05-16 20:43:17
*/
public interface InnerUserInterfaceInfoService {

    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);
}
