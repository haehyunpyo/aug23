package com.phyho.web.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MultiBoardDAO {

	List<Map<String, Object>> list(int board);

	List<Map<String, Object>> boardlist();

	int mbWrite(Map<String, Object> map);

	Map<String, Object> mbdetail(int mbno);

	
}



