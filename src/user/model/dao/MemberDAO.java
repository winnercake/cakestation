package user.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import common.JDBCTemplate;
import user.model.vo.CustomerMember;

public class MemberDAO {
	public CustomerMember selectOneMember(Connection conn, String userId, String userPwd) {
		Statement stmt = null;
		ResultSet rset = null;
		String query = "SELECT * FROM CUSTOMER_MEMBER WHERE MEMBER_ID='" + userId + "' AND MEMBER_PWD = '" + userPwd + "'";
		CustomerMember cMember = null;
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			if (rset.next()) {
				cMember = new CustomerMember();
				cMember.setMemberId(rset.getString("MEMBER_ID"));
				cMember.setMemberPwd(rset.getNString("MEMBER_PWD"));
				cMember.setMemberName(rset.getString("MEMBER_NAME"));
				cMember.setMemberEmail(rset.getString("MEMBER_EMAIL"));
				cMember.setMemberAddress(rset.getString("MEMBER_ADDRESS"));
				cMember.setMemberPhone(rset.getString("MEMBER_PHONE"));
				cMember.setMemberEnroll(rset.getDate("MEMBER_ENROLL"));
				cMember.setMemberType(rset.getString("MEMBER_TYPE"));
				cMember.setMemberRecieve(rset.getString("MEMBER_RECIEVE"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(stmt);
		}
		return cMember;
	}

	public int insertMember(Connection conn, CustomerMember cMember) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "INSERT INTO CUSTOMER_MEMBER VALUES(?,?,?,?,?,?,SYSDATE,?,?)";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, cMember.getMemberId());
			pstmt.setString(2, cMember.getMemberPwd());
			pstmt.setString(3, cMember.getMemberName());
			pstmt.setString(4, cMember.getMemberEmail());
			pstmt.setString(5, cMember.getMemberAddress());
			pstmt.setString(6, cMember.getMemberPhone());
			pstmt.setString(7, cMember.getMemberType());
			pstmt.setString(8, cMember.getMemberRecieve()); 
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
		return result;
	}

	public CustomerMember findId(Connection conn, String email) {
		Statement stmt = null;
		ResultSet rset = null;
		String query = "SELECT * FROM CUSTOMER_MEMBER WHERE MEMBER_EMAIL='" + email + "'";
		CustomerMember cMember = null;
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			if(rset.next()) {
				cMember = new CustomerMember();
				cMember.setMemberId(rset.getString("MEMBER_ID"));
				cMember.setMemberPwd(rset.getString("MEMBER_PWD"));
				cMember.setMemberName(rset.getString("MEMBER_NAME"));
				cMember.setMemberEmail(rset.getString("MEMBER_EMAIL"));
				cMember.setMemberAddress(rset.getString("MEMBER_ADDRESS"));
				cMember.setMemberPhone(rset.getString("MEMBER_PHONE"));
				cMember.setMemberEnroll(rset.getDate("MEMBER_ENROLL"));
				cMember.setMemberType(rset.getString("MEMBER_TYPE"));
				cMember.setMemberRecieve(rset.getString("MEMBER_RECIEVE"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(stmt);
		}
		return cMember;
	}
}
