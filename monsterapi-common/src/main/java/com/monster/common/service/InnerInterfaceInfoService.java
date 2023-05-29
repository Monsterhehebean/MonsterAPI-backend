package com.monster.common.service;

import com.monster.common.model.entity.InterfaceInfo;

/**
* @author Sherlno
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-05-04 13:36:34
*/
public interface InnerInterfaceInfoService {

    /**
     * 从数据中查询模拟接口是否存在(请求路径、请求方法)
     * @param path
     * @param method
     * @return
     */
    InterfaceInfo getInterfaceInfo(String path, String method);

}
