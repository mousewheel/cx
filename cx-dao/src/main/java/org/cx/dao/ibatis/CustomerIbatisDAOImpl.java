package org.cx.dao.ibatis;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.cx.dao.ICustomerDAO;
import org.cx.dao.ibatis.mapper.CustomerMapper;
import org.cx.dao.model.Customer;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

@Repository("Customer")
public class CustomerIbatisDAOImpl extends SqlSessionDaoSupport implements ICustomerDAO<Customer> {

	@Override
	public List<Customer> queryByMap(Map<String, Object> params, String tabNameSuffix) {
	
		CustomerMapper mapper = getSqlSession().getMapper(CustomerMapper.class);
		List<Customer> customers  = mapper.queryByMap(params);

		return customers;
	}
}
