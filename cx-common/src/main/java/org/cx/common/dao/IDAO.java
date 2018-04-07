package org.cx.common.dao;

import java.util.List;
import java.util.Map;

public interface IDAO<T>  {
	
	 public List<T> queryByMap(Map<String, Object> params, String tabNameSuffix);
}
