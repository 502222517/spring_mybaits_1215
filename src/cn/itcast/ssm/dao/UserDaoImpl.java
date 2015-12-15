package cn.itcast.ssm.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.itcast.ssm.po.User;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
	
	
 

	@Override
	public User findUserById(int id) throws Exception {
		// TODO Auto-generated method stub
		
		SqlSession sqlSession=this.getSqlSession();
		// ≤È—Ø
		User user= sqlSession.selectOne("test.findUserById",id);
		
		
		return user;
	}

 

}
