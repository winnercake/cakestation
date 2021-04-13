package user.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import common.JDBCTemplate;
import order.model.vo.Order;
import user.model.vo.CustomerMember;

public class CustomerDAO {
	
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
				cMember.setMemberPhone(rset.getString("MEMEBER_PHONE"));
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
//	public CustomerMember selectOneMember(Connection conn, String userId, String userPwd) {
//		Statement stmt = null;
//		ResultSet rset = null; 
//		CustomerMember ctMember = null;
//		String query = "";
//		try {
//			stmt = conn.createStatement();
//			rset = stmt.executeQuery(query);
//			if(rset.next()) {
//				ctMember = new CustomerMember();
//				ctMember.setMemberId(rset.getString("MEMBER_ID"));
//				ctMember.setMemberPwd(rset.getString("MEMBER_PWD"));
//				ctMember.setMemberName(rset.getString("MEMBER_NAME"));
//				ctMember.setMemberAddress(rset.getString("MEMBER_ADDRESS"));
//				ctMember.setMemberPhone(rset.getString("MEMBER_PHONE"));
//				ctMember.setMemberEmail(rset.getString("MEMBER_EMAIL"));
//				ctMember.setMemberType(rset.getString("MEMBER_TYPE").charAt(0));
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			JDBCTemplate.close(rset);
//			JDBCTemplate.close(stmt);
//		}
//		
//		return ctMember;
//	}
	
	public int insertMember(Connection conn, CustomerMember cMember) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "INSERT INTO CUSTOMER_MEMBER VALUSE(?,?,?,?,?,?,SYSDATE,?,?)";

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
	
	public CustomerMember selectOneById(Connection conn, String userId) {
		PreparedStatement pstmt = null;
		ResultSet rset = null; 
		String query = "SELECT * FROM MEMBER WHERE MEMBER_ID = ?";
		CustomerMember ctMember = null;
		try {
			pstmt = conn.prepareStatement(query); 
			pstmt.setString(1, userId);
			rset = pstmt.executeQuery();
			if(rset.next()) {
				ctMember = new CustomerMember();
				ctMember.setMemberId(rset.getString("MEMBER_ID"));
				ctMember.setMemberPwd(rset.getString("MEMBER_PWD"));
				ctMember.setMemberName(rset.getString("MEMBER_NAME"));
				ctMember.setMemberAddress(rset.getString("MEMBER_ADDRESS"));
				ctMember.setMemberPhone(rset.getString("MEMBER_PHONE"));
				ctMember.setMemberEmail(rset.getString("MEMBER_EMAIL"));
				//ctMember.setMemberType(rset.getString("MEMBER_TYPE").charAt(0));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		return ctMember;
	}

	public int updateMember(Connection conn, CustomerMember ctMember) {
		int result = 0;
		Statement stmt = null;
		String query = "UPDATE ";
		
		try {
			stmt = conn.createStatement();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	public int deleteMember(Connection conn, String userId, String userPwd) {
		int result = 0;
		Statement stmt = null;
		String query = "";
		
		
		
		return result;
	}

	public ArrayList<Order> showOrderList(Connection conn) {
		Statement stmt = null;
		ResultSet rset = null; 
		ArrayList<Order> list = null;
		
		
		
		return list;
	}

	public int deleteOrder(Connection conn, int orderNo) {
		int result = 0;
		Statement stmt = null;
		String query = "";
		
		
		
		return result;
	}

	

	

}
