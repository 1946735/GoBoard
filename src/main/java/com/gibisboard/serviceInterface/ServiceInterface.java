package com.gibisboard.serviceInterface;

import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import com.gibisboard.entity.GIBIS_MR_M;

public interface ServiceInterface {
	
	List<GIBIS_MR_M>findAll() throws SQLException;

}
