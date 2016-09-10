package com.zgj.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zgj.model.Receiving;

/**
 * receiving
 * @version 1.0 2016-03-18
 * @powerby hetgyd 
 */
@Service
public interface ReceivingService {

    public Receiving selectByPrimaryKey(Integer id);

    public int deleteByPrimaryKey(Integer id);

    public int updateByPrimaryKeySelective(Receiving record);

    public int updateByPrimaryKey(Receiving record);

    public int insert(Receiving record);
    
    public int insertSelective(Receiving record);
}