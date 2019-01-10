package dao.mapper;

import model.IcAnnouncePermit;

public interface IcAnnouncePermitMapper {
    int deleteByPrimaryKey(Short permitId);

    int insert(IcAnnouncePermit record);

    int insertSelective(IcAnnouncePermit record);

    IcAnnouncePermit selectByPrimaryKey(Short permitId);

    int updateByPrimaryKeySelective(IcAnnouncePermit record);

    int updateByPrimaryKey(IcAnnouncePermit record);
}