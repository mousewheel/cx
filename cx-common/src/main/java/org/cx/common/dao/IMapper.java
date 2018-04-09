package org.cx.common.dao;


import java.util.List;
import java.util.Map;

public interface IMapper<T> {
	public List<T> queryByMap(Map<String, Object> map);
	
	public Integer countByMap(Map<String, Object> map);

}
