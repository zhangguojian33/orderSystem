package com.zgj.dao;

import com.zgj.model.Recharging;

public interface RechargingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Recharging record);

    int insertSelective(Recharging record);

    Recharging selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Recharging record);

    int updateByPrimaryKey(Recharging record);
}