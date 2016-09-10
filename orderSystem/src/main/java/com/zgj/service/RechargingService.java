package com.zgj.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zgj.model.Recharging;

/**
 * recharging
 * @version 1.0 2016-03-18
 * @powerby hetgyd 
 */
@Service
public interface RechargingService {
	
    public Recharging selectByPrimaryKey(Integer id);


    public int deleteByPrimaryKey(Integer id);

    public int updateByPrimaryKeySelective(Recharging record);

    public int updateByPrimaryKey(Recharging record);

    public int insert(Recharging record);

    public int insertSelective(Recharging record);
}