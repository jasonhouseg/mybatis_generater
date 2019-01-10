package dao.mapper;

import model.IcAnnounce;

public interface IcAnnounceMapper {
    int deleteByPrimaryKey(Short announceId);

    int insert(IcAnnounce record);

    int insertSelective(IcAnnounce record);

    IcAnnounce selectByPrimaryKey(Short announceId);

    int updateByPrimaryKeySelective(IcAnnounce record);

    int updateByPrimaryKeyWithBLOBs(IcAnnounce record);

    int updateByPrimaryKey(IcAnnounce record);
}