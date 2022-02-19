package com.caoshishun.service;

import com.caoshishun.pojo.Department;
import com.baomidou.mybatisplus.extension.service.IService;
import com.caoshishun.pojo.RespBean;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author caoshishun
 * @since 2022-01-23
 */
public interface IDepartmentService extends IService<Department> {

    List<Department> getAllDepartments();

    RespBean addDep(Department dep);

    RespBean deleteDep(Integer id);
}
