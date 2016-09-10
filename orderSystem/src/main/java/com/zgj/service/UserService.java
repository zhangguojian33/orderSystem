package com.zgj.service;

import java.util.List;

import com.zgj.model.User;
import com.zgj.vo.UserVo;

public interface UserService {
	public User selectByPrimaryKey(Integer id);
	public int deleteByPrimaryKey(Integer id);
	public int updateByPrimaryKeySelective(User record);
	public int updateByPrimaryKey(User record);
	public int insert(User record);
	public int insertSelective(User record);
}
