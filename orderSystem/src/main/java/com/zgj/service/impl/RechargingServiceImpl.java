package com.zgj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zgj.dao.RechargingMapper;
import com.zgj.model.Recharging;
import com.zgj.service.RechargingService;

/**
 * recharging
 * @version 1.0 2016-03-18
 * @powerby hetgyd 
 */
@Service
public class RechargingServiceImpl implements RechargingService{
    @Autowired
    private RechargingMapper rechargingMapper;

	
	public Recharging selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public int updateByPrimaryKeySelective(Recharging record) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public int updateByPrimaryKey(Recharging record) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public int insert(Recharging record) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public int insertSelective(Recharging record) {
		// TODO Auto-generated method stub
		return 0;
	}

   
}