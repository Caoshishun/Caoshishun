package com.caoshishun.mapper;

import com.caoshishun.pojo.AdminRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.caoshishun.pojo.RespBean;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author caoshishun
 * @since 2022-01-23
 */
public interface AdminRoleMapper extends BaseMapper<AdminRole> {

    Integer addAdminRole(@Param("adminId") Integer adminId, @Param("rids") Integer[] rids);
}
