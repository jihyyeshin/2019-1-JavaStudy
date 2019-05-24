package com.test.sqlMap;

import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//myBatis ���� ������ �о� DB Ŀ�ؼ��� ������ Ŀ�ؼ� ���� session�� ��ȯ

public class SqlSessionManager {

	public static SqlSessionFactory sqlSession;
	static {
		String resource = "com/test/sqlMap/Configuration.xml";
		Reader reader;
		try {
			reader = Resources.getResourceAsReader(resource);
			sqlSession = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static SqlSessionFactory getSqlSession() {
		return sqlSession;
	}
}