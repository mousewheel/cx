package org.cx.common.dao;


import java.math.BigInteger;
import java.util.List;
import java.util.Map;

public interface IMapper<T> {
	
	public List<T> queryByMap(Map<String, Object> map);
	
	public Integer countByMap(Map<String, Object> map);
	
	public BigInteger insert(T t);
	
	public Integer updateByMap(Map<String, Object> newValue, Map<String,Object> cond);

}
