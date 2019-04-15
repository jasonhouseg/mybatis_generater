package com.fn.dao.mapper;

import com.fn.model.SysUserLoginLog;
import com.fn.model.SysUserLoginLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserLoginLogMapper {
    long countByExample(SysUserLoginLogExample example);

    int deleteByExample(SysUserLoginLogExample example);

    int deleteByPrimaryKey(Long logId);

    int insert(SysUserLoginLog record);

    int insertSelective(SysUserLoginLog record);

    List<SysUserLoginLog> selectByExample(SysUserLoginLogExample example);

    SysUserLoginLog selectByPrimaryKey(Long logId);

    int updateByExampleSelective(@Param("record") SysUserLoginLog record, @Param("example") SysUserLoginLogExample example);

    int updateByExample(@Param("record") SysUserLoginLog record, @Param("example") SysUserLoginLogExample example);

    int updateByPrimaryKeySelective(SysUserLoginLog record);

    int updateByPrimaryKey(SysUserLoginLog record);
}