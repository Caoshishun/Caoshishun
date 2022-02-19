package com.caoshishun.service;

import com.caoshishun.pojo.MenuRole;
import com.baomidou.mybatisplus.extension.service.IService;
import com.caoshishun.pojo.RespBean;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author caoshishun
 * @since 2022-01-23
 */
public interface IMenuRoleService extends IService<MenuRole> {

    RespBean updateMenuRole(Integer rid, Integer[] mids);
}
