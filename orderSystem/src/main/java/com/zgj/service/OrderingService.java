package com.zgj.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zgj.model.Ordering;

/**
 * ordering
 * @version 1.0 2016-03-18
 * @powerby hetgyd 
 */
@Service
public interface OrderingService {
	

    public Ordering selectByPrimaryKey(Integer id);

    public int deleteByPrimaryKey(Integer id);

    public int updateByPrimaryKeySelective(Ordering record);
    
    public int updateByPrimaryKey(Ordering record);


    public int insert(Ordering record);
    
    public int insertSelective(Ordering record);
}