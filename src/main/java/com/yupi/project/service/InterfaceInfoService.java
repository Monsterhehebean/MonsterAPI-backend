package com.yupi.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.monster.common.model.entity.InterfaceInfo;

/**
* @author Sherlno
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-05-04 13:36:34
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);

}
