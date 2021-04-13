package user.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import common.JDBCTemplate;
import shop.model.vo.ShopMember;
import user.model.vo.CustomerMember;

public class AdminDAO {

	public ArrayList<CustomerMember> selectCustomerList(Connection conn) {
		Statement stmt = null;
		ResultSet rset = null;
		ArrayList<CustomerMember> list = null;
		String query = "SELECT * FROM CUSTOMER_MEMBER WHERE MEMBER_TYPE='C'";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			list = new ArrayList<CustomerMember>();
			while(rset.next()) {
				CustomerMember ctMember = new CustomerMember();
				ctMember.setMemberId(rset.getString("MEMBER_ID"));
				ctMember.setMemberPwd(rset.getString("MEMBER_PWD"));
				ctMember.setMemberName(rset.getString("MEMBER_NAME"));
				ctMember.setMemberEmail(rset.getString("MEMBER_EMAIL"));
				ctMember.setMemberAddress(rset.getString("MEMBER_ADDRESS"));
				ctMember.setMemberPhone(rset.getString("MEMBER_PHONE"));
				list.add(ctMember);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(stmt);
		}
		
		return list;
	}

	public ArrayList<ShopMember> selectShopList(Connection conn) {
		Statement stmt = null;
		ResultSet rset = null;
		ArrayList<ShopMember> list = null;
		String query = "";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			list = new ArrayList<ShopMember>();
			while(rset.next()) {
				ShopMember sMember = new ShopMember();
				sMember.setShopId(rset.getString("SHOP_ID"));
				sMember.setShopPwd(rset.getString("SHOP_PWD"));
				sMember.setShopName(rset.getString("SHOP_NAME"));
				sMember.setCEOName(rset.getString("CEO_NAME"));
				sMember.setShopCRN(rset.getString("SHOP_CRN"));
				sMember.setShopLAdd(rset.getString("SHOP_L_ADD"));
				sMember.setShopMAdd(rset.getString("SHOP_M_ADD"));
				sMember.setShopSAdd(rset.getString("SHOP_S_ADD"));
				sMember.setShopEmail(rset.getString("SHOP_EMAIL"));
				sMember.setShopPhone(rset.getString("SHOP_PHONE"));
				list.add(sMember);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(stmt);
		}
		
		return list;
	}

	public ArrayList<ShopMember> signUpList(Connection conn) {
		Statement stmt = null;
		ResultSet rset = null;
		ArrayList<ShopMember> list = null;
		String query = "";		
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			list = new ArrayList<ShopMember>();
			while(rset.next()) {
				ShopMember sMember = new ShopMember();
				sMember.setShopId(rset.getString("SHOP_ID"));
				sMember.setShopPwd(rset.getString("SHOP_PWD"));
				sMember.setShopName(rset.getString("SHOP_NAME"));
				sMember.setCEOName(rset.getString("CEO_NAME"));
				sMember.setShopCRN(rset.getString("SHOP_CRN"));
				sMember.setShopLAdd(rset.getString("SHOP_L_ADD"));
				sMember.setShopMAdd(rset.getString("SHOP_M_ADD"));
				sMember.setShopSAdd(rset.getString("SHOP_S_ADD"));
				sMember.setShopEmail(rset.getString("SHOP_EMAIL"));
				sMember.setShopPhone(rset.getString("SHOP_PHONE"));
				list.add(sMember);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(stmt);
		}
		
		return list;
	}

	public ArrayList<ShopMember> dropList(Connection conn) {
		Statement stmt = null;
		ResultSet rset = null;
		ArrayList<ShopMember> list = null;
		String query = "";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			list = new ArrayList<ShopMember>();
			while(rset.next()) {
				ShopMember sMember = new ShopMember();
				sMember.setShopId(rset.getString("SHOP_ID"));
				sMember.setShopPwd(rset.getString("SHOP_PWD"));
				sMember.setShopName(rset.getString("SHOP_NAME"));
				sMember.setCEOName(rset.getString("CEO_NAME"));
				sMember.setShopCRN(rset.getString("SHOP_CRN"));
				sMember.setShopLAdd(rset.getString("SHOP_L_ADD"));
				sMember.setShopMAdd(rset.getString("SHOP_M_ADD"));
				sMember.setShopSAdd(rset.getString("SHOP_S_ADD"));
				sMember.setShopEmail(rset.getString("SHOP_EMAIL"));
				sMember.setShopPhone(rset.getString("SHOP_PHONE"));
				list.add(sMember);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(stmt);
		}
		
		return list;
	}
	
	public int approvalMember(Connection conn, String userId) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "";
		
		try {
			pstmt = conn.prepareStatement(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(pstmt);
		}
		
		return result;
	}
	
	public int dropMember(Connection conn, String userId) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(pstmt);
		}
		
		return result;
	}

	public int deleteCtMember(Connection conn, String userId) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	public int deleteShopMember(Connection conn, String userId) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	public int updateCtMember(Connection conn, CustomerMember ctMember) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, ctMember.getMemberPwd());
			
			
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	public int updateShopMember(Connection conn, ShopMember sMember) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, sMember.getShopPwd());
			
			
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	
}
