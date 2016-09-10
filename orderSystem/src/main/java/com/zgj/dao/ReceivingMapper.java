package com.zgj.dao;

import com.zgj.model.Receiving;

public interface ReceivingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Receiving record);

    int insertSelective(Receiving record);

    Receiving selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Receiving record);

    int updateByPrimaryKey(Receiving record);
}