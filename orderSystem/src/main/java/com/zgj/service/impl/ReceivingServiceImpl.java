package com.zgj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zgj.dao.ReceivingMapper;
import com.zgj.model.Receiving;
import com.zgj.service.ReceivingService;

/**
 * receiving
 * @version 1.0 2016-03-18
 * @powerby hetgyd 
 */
@Service
public class ReceivingServiceImpl implements ReceivingService{
    @Autowired
    private ReceivingMapper receivingMapper;

	
	public Receiving selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public int updateByPrimaryKeySelective(Receiving record) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public int updateByPrimaryKey(Receiving record) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public int insert(Receiving record) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public int insertSelective(Receiving record) {
		// TODO Auto-generated method stub
		return 0;
	}

   
}