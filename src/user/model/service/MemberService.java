package user.model.service;

import java.sql.Connection;
import java.sql.SQLException;

import common.JDBCTemplate;
import user.model.dao.MemberDAO;
import user.model.vo.CustomerMember;

public class MemberService {
	private JDBCTemplate factory;

	public MemberService() {
		factory = JDBCTemplate.getConnection();
	}
	
	public CustomerMember selectOneMember(String userId, String userPwd) {
		CustomerMember cMember = null;
		Connection conn = null;
		try {
			conn = factory.createConnection();
			cMember = new MemberDAO().selectOneMember(conn, userId, userPwd);
			System.out.println(cMember.toString());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(conn);
		}
		return cMember;
	}

	public int registerMember(CustomerMember cMember) {
		int result = 0;
		Connection conn = null;
		
		try {
			conn = factory.createConnection();
			result = new MemberDAO().insertMember(conn, cMember);
			if(result > 0) {
				JDBCTemplate.commit(conn);
			} else {
				JDBCTemplate.rollback(conn);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(conn);
		}
		return result;
	}

	public CustomerMember findId(String email) {
		Connection conn = null;
		CustomerMember cMember = null;
		
		try {
			conn = factory.createConnection();
			cMember = new MemberDAO().findId(conn, email);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(conn);
		}
		return cMember;
	}
}
