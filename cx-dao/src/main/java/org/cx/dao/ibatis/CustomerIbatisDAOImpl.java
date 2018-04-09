package org.cx.dao.ibatis;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.cx.dao.ICustomerDAO;
import org.cx.dao.ibatis.mapper.CustomerMapper;
import org.cx.dao.model.Customer;
import org.springframework.stereotype.Repository;

@Repository("Customer")
public class CustomerIbatisDAOImpl implements ICustomerDAO<Customer> {

	@Override
	public List<Customer> queryByMap(Map<String, Object> params, String tabNameSuffix) {

		String resource = "org/mybatis/example/mybatis-config.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		SqlSession session = sqlSessionFactory.openSession();
		try {
			CustomerMapper mapper = session.getMapper(CustomerMapper.class);
			List<Customer> customers = mapper.queryByMap(params);

			return customers;
		} finally {
			session.close();
		}
	}
}
