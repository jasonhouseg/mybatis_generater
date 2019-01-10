package dao.mapper;

import model.IcInformation;

public interface IcInformationMapper {
    int deleteByPrimaryKey(Short uniNo);

    int insert(IcInformation record);

    int insertSelective(IcInformation record);

    IcInformation selectByPrimaryKey(Short uniNo);

    int updateByPrimaryKeySelective(IcInformation record);

    int updateByPrimaryKey(IcInformation record);
}