package com.example;

import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 *
 * @author dmsibley
 */
public class MyBatisConnectionFactory {
	private static SqlSessionFactory sqlSessionFactory;
	private final static String RESOURCE = "mybatis-config.xml";

	static {
		try (InputStream inputStream = Resources.getResourceAsStream(RESOURCE)) {
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (Exception ex) {
		}
	}

	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
}
