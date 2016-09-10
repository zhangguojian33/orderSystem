package com.zgj.dao;

import com.zgj.model.Ordering;

public interface OrderingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Ordering record);

    int insertSelective(Ordering record);

    Ordering selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ordering record);

    int updateByPrimaryKey(Ordering record);
}