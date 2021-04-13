package admin.model.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import admin.model.dao.AdminDAO;
import common.JDBCTemplate;
import shop.model.vo.ShopMember;
import user.model.vo.CustomerMember;

public class AdminService {
	
	private JDBCTemplate factory;
	
	public AdminService() {
		factory = JDBCTemplate.getConnection();
	}
	
	public ArrayList<CustomerMember> selectCustomerList() {
		ArrayList<CustomerMember> list = null;
		Connection conn = null;
		
		try {
			conn = factory.createConnection();
			list = new AdminDAO().selectCustomerList(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
		}
		
		return list;
	}
	
	public ArrayList<ShopMember> selectShopList() {
		ArrayList<ShopMember> list = null;
		Connection conn = null;
		
		try {
			conn = factory.createConnection();
			list = new AdminDAO().selectShopList(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
		}
		
		return list;
	}
	
	public ArrayList<ShopMember> signUpList() {
		ArrayList<ShopMember> list = null;
		Connection conn = null;
		
		try {
			conn = factory.createConnection();
			list = new AdminDAO().signUpList(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
		}
		
		return list;
	}
	
	public ArrayList<ShopMember> dropList() {
		ArrayList<ShopMember> list = null;
		Connection conn = null;
		
		try {
			conn = factory.createConnection();
			list = new AdminDAO().dropList(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
		}
		
		return list;
	}
	
	public int approvalMember(String userId) {
		int result = 0;
		Connection conn = null;
		try {
			conn = factory.createConnection();
			result = new AdminDAO().approvalMember(conn, userId);
			if(result > 0) {
				JDBCTemplate.commit(conn);
			}else {
				JDBCTemplate.rollback(conn);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
		}
		
		return result;
	}
	
	public int rejectSignUp(String userId) {
		int result = 0;
		Connection conn = null;
		try {
			conn = factory.createConnection();
			result = new AdminDAO().deleteShopMember(conn, userId);
			if(result > 0) {
				JDBCTemplate.commit(conn);
			}else {
				JDBCTemplate.rollback(conn);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
		}
		
		return result;
	}
	
	public int dropMember(String userId) {
		int result = 0;
		Connection conn = null;
		try {
			conn = factory.createConnection();
			result = new AdminDAO().deleteShopMember(conn, userId);
			if(result > 0) {
				JDBCTemplate.commit(conn);
			}else {
				JDBCTemplate.rollback(conn);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
		}
		
		return result;
	}
	
	public int rejectdropMem(String userId) {
		int result = 0;
		Connection conn = null;
		try {
			conn = factory.createConnection();
			result = new AdminDAO().rejectdropMem(conn, userId);
			if(result > 0) {
				JDBCTemplate.commit(conn);
			}else {
				JDBCTemplate.rollback(conn);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
		}
		
		return result;
	}
	
	public int deleteCtMember(String userId) {
		int result = 0;
		Connection conn = null;
		try {
			conn = factory.createConnection();
			result = new AdminDAO().deleteCtMember(conn, userId);
			if(result > 0) {
				JDBCTemplate.commit(conn);
			}else {
				JDBCTemplate.rollback(conn);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
		}
		
		return result;
	}
	
	public int deleteShopMember(String userId) {
		int result = 0;
		Connection conn = null;
		try {
			conn = factory.createConnection();
			result = new AdminDAO().deleteShopMember(conn, userId);
			if(result > 0) {
				JDBCTemplate.commit(conn);
			}else {
				JDBCTemplate.rollback(conn);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
		}
		
		return result;
	}
	
	public int updateCtMember(CustomerMember ctMember) {
		int result = 0;
		Connection conn = null;
		try {
			conn = factory.createConnection();
			result = new AdminDAO().updateCtMember(conn, ctMember);
			if(result > 0) {
				JDBCTemplate.commit(conn);
			}else {
				JDBCTemplate.rollback(conn);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
		}
		
		return result;
	}
	
	public int updateShopMember(ShopMember sMember) {
		int result = 0;
		Connection conn = null;
		try {
			conn = factory.createConnection();
			result = new AdminDAO().updateShopMember(conn, sMember);
			if(result > 0) {
				JDBCTemplate.commit(conn);
			}else {
				JDBCTemplate.rollback(conn);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
		}
		
		return result;
	}
}
