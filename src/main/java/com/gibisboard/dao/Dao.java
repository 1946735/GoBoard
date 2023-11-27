package com.gibisboard.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.gibisboard.entity.GIBIS_MR_M;


@Mapper
public interface Dao {

	List<GIBIS_MR_M> findAll();
	
}
