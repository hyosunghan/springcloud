package com.example.uaaservice.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.uaaservice.entity.UserRole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Created by hyosunghan on 2019/7/12.
 */

@Mapper
public interface UserRoleMapper extends BaseMapper<UserRole> {
}
