package com.fn.dao.mapper;

import com.fn.model.SysUserOperationLog;
import com.fn.model.SysUserOperationLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserOperationLogMapper {
    long countByExample(SysUserOperationLogExample example);

    int deleteByExample(SysUserOperationLogExample example);

    int deleteByPrimaryKey(Long logId);

    int insert(SysUserOperationLog record);

    int insertSelective(SysUserOperationLog record);

    List<SysUserOperationLog> selectByExample(SysUserOperationLogExample example);

    SysUserOperationLog selectByPrimaryKey(Long logId);

    int updateByExampleSelective(@Param("record") SysUserOperationLog record, @Param("example") SysUserOperationLogExample example);

    int updateByExample(@Param("record") SysUserOperationLog record, @Param("example") SysUserOperationLogExample example);

    int updateByPrimaryKeySelective(SysUserOperationLog record);

    int updateByPrimaryKey(SysUserOperationLog record);
}