package com.zgj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zgj.dao.OrderingMapper;
import com.zgj.model.Ordering;
import com.zgj.service.OrderingService;

/**
 * ordering
 * version 1.0 2016-03-18
 * powerby hetgyd 
 */
@Service
public class OrderingServiceImpl implements OrderingService{
    @Autowired
    private OrderingMapper orderingMapper;

	
	public Ordering selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public int updateByPrimaryKeySelective(Ordering record) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public int updateByPrimaryKey(Ordering record) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public int insert(Ordering record) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public int insertSelective(Ordering record) {
		// TODO Auto-generated method stub
		return 0;
	}

   
}