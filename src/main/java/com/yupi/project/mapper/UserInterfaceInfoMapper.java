package com.yupi.project.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.monster.common.model.entity.UserInterfaceInfo;

import java.util.List;

/**
* @author Sherlno
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Mapper
* @createDate 2023-05-16 20:43:17
* @Entity com.yupi.project.model.entity.UserInterfaceInfo
*/
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {

    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);

}




