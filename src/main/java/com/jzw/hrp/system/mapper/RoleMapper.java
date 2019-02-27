package com.jzw.hrp.system.mapper;

import org.apache.ibatis.annotations.Param;
import com.jzw.hrp.system.dto.Role;

import java.util.List;

/**
 * Created by sang on 2018/1/1.
 */
public interface RoleMapper {
    List<Role> roles();

    int addNewRole(@Param("role") String role, @Param("roleZh") String roleZh);

    int deleteRoleById(Long rid);
}
