package com.caoshishun.mapper;

import com.caoshishun.pojo.Department;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author caoshishun
 * @since 2022-01-23
 */
public interface DepartmentMapper extends BaseMapper<Department> {

    /**
     *
     * @return
     */
    List<Department> getAllDepartments(Integer parentId);

    void addDep(@RequestBody Department dep);

    void deleteDep(Department dep);
}
