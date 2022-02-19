package com.caoshishun.utils;

import com.caoshishun.pojo.Admin;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * 功能描述：
 *
 * @author 曹世顺
 * @version 1.0
 * @date 2022/2/12 0012 15:28
 */
public class AdminUtils {
    public static Admin getCurrentAdmin(){
        return (Admin) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
