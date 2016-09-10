package com.zgj.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zgj.model.Menu;

/**
 * menu
 * @version 1.0 2016-03-18
 * @powerby hetgyd 
 */
@Service
public interface MenuService {

    public Menu selectByPrimaryKey(Integer id);

    public int deleteByPrimaryKey(Integer id);
    
    public int updateByPrimaryKeySelective(Menu record);

    public int updateByPrimaryKey(Menu record);


    public int insert(Menu record);

    public int insertSelective(Menu record);
}