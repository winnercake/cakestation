package user.model.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import common.JDBCTemplate;
import order.model.vo.Order;
import user.model.dao.CustomerDAO;
import user.model.dao.MemberDAO;
import user.model.vo.CustomerMember;

public class CustomerService {

	private JDBCTemplate factory;
	
	public CustomerService() {
		factory = JDBCTemplate.getConnection();
	}
	
	public CustomerMember selectOneMember(String userId, String userPwd) {
		CustomerMember ctMember = null;
		Connection conn = null;
		
		try {
			conn = factory.createConnection();
			ctMember = new CustomerDAO().selectOneMember(conn, userId, userPwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
		}
		return ctMember;
	}

	public int registerMember(CustomerMember cMember) {
		int result =0; // DAO(荑쇰━臾몄떎�뻾) 寃곌낵媛� servlet�쑝濡� 諛섑솚
		Connection conn = null;
		
		try {
			conn = factory.createConnection();
			result = new MemberDAO().insertMember(conn, cMember);
			// select 荑쇰━�뿉�꽑 而ㅻ컠/濡ㅻ갚�씠 �븘�슂�뾾�쑝誘�濡� �깮�왂�뻽�뿀�쓬. �씠嫄� insert(join)
			if(result > 0) {
				JDBCTemplate.commit(conn);
			} else {
				JDBCTemplate.rollback(conn);
			}
			System.out.println("寃곌낵媛� : " + result); // �솗�씤�슜
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(conn);
		}
		return result;
	}
	
	public CustomerMember selectOneById(String userId) {
		CustomerMember ctMember = null;
		Connection conn = null;
		
		try {
			conn = factory.createConnection();
			ctMember = new CustomerDAO().selectOneById(conn, userId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(conn);
		}
		return ctMember;
	}

	public int updateMember(CustomerMember ctMember) {
		int result = 0;
		Connection conn = null;
		
		try {
			conn = factory.createConnection();
			result = new CustomerDAO().updateMember(conn, ctMember);
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
	
	public int deleteMember(String userId, String userPwd) {
		int result = 0;
		Connection conn = null;
		
		try {
			conn = factory.createConnection();
			result = new CustomerDAO().deleteMember(conn, userId, userPwd);
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
	
	public ArrayList<Order> showOrderList() {
		ArrayList<Order> list = null;
		Connection conn = null;
		
		try {
			conn = factory.createConnection();
			list = new CustomerDAO().showOrderList(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
		}
		return list;
	}
	
	public int cancelOrder(int orderNo) {
		int result = 0;
		Connection conn = null;
		
		try {
			conn = factory.createConnection();
			result = new CustomerDAO().deleteOrder(conn, orderNo);
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
