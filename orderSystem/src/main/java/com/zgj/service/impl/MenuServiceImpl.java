package com.zgj.service.impl;

import com.zgj.dao.MenuMapper;
import com.zgj.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * menu
 * @version 1.0 2016-03-18
 * @powerby hetgyd 
 */
@Service
public class MenuServiceImpl implements MenuService{
    @Autowired
    private MenuMapper menuMapper;

	public com.zgj.model.Menu selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int updateByPrimaryKeySelective(com.zgj.model.Menu record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKey(com.zgj.model.Menu record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insert(com.zgj.model.Menu record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insertSelective(com.zgj.model.Menu record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}
}