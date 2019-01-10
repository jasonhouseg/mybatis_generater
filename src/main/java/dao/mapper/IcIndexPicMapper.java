package dao.mapper;

import model.IcIndexPic;

public interface IcIndexPicMapper {
    int deleteByPrimaryKey(Short picId);

    int insert(IcIndexPic record);

    int insertSelective(IcIndexPic record);

    IcIndexPic selectByPrimaryKey(Short picId);

    int updateByPrimaryKeySelective(IcIndexPic record);

    int updateByPrimaryKey(IcIndexPic record);
}