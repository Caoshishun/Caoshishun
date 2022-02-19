package com.caoshishun.service.impl;

import com.caoshishun.pojo.Department;
import com.caoshishun.mapper.DepartmentMapper;
import com.caoshishun.pojo.RespBean;
import com.caoshishun.service.IDepartmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author caoshishun
 * @since 2022-01-23
 */
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements IDepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> getAllDepartments() {
        return departmentMapper.getAllDepartments(-1);
    }

    /**
     * 添加部门
     * @param dep
     * @return
     */
    @Override
    public RespBean addDep(Department dep) {
        dep.setEnabled(true);
        departmentMapper.addDep(dep);
        if(dep.getResult() == 1){
            return RespBean.success("添加成功!",dep);
        }
        return RespBean.error("添加失败!");
    }

    /**
     * 删除部门
     * @param id
     * @return
     */

    @Override
    public RespBean deleteDep(Integer id) {
        Department dep = new Department();
        dep.setId(id);
        departmentMapper.deleteDep(dep);
        if(dep.getResult() == -2){
            return RespBean.error("该部门下还有子部门,删除失败!");
        }
        if(dep.getResult() == -1){
            return RespBean.error("该部门下还有员工，删除失败");
        }
        if(dep.getResult() == 1){
            return RespBean.success("删除成功");
        }
        return RespBean.error("删除失败");
    }
}
