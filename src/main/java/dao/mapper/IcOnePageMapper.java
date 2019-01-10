package dao.mapper;

import model.IcOnePage;

public interface IcOnePageMapper {
    int deleteByPrimaryKey(Short pageId);

    int insert(IcOnePage record);

    int insertSelective(IcOnePage record);

    IcOnePage selectByPrimaryKey(Short pageId);

    int updateByPrimaryKeySelective(IcOnePage record);

    int updateByPrimaryKeyWithBLOBs(IcOnePage record);

    int updateByPrimaryKey(IcOnePage record);
}