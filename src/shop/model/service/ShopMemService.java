package shop.model.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import cakeinfo.model.vo.PageData;
import common.JDBCTemplate;
import shop.model.dao.ShopMemDAO;
import shop.model.vo.ShopMember;

public class ShopMemService {

	private JDBCTemplate factory;

	public ShopMemService() {
		factory = JDBCTemplate.getConnection();
	}

	// 회원가입 (insert)
	public int registerMember(ShopMember shopMember) {
		int result = 0;
		Connection conn = null;

		try {
			conn = factory.createConnection();
			result = new ShopMemDAO().insertMember(conn, shopMember);
			if (result > 0) {
				JDBCTemplate.commit(conn);
			} else {
				JDBCTemplate.rollback(conn);
			}
			System.out.println("결과값 : " + result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(conn);
		}
		return result;
	}

	// 이거 뭔데...? selectOneMember?(로그인)
	public ShopMember selectOneMember(String userId, String userPwd) {
		
		
		return null;
	}
	
//	public ShopMember printOne(String shopId) {
//		Connection conn = null;
//		ShopMember shopMember = null;
//		
//		shopMember = new ShopMemDAO().selectOne(conn, shopMember);
//		
//		return null;
//	}

	// 업체 찾기 전체 리스트
	public PageData printAllList(int currentPage) {

		Connection conn = null;
		PageData pageData = new PageData();

		ArrayList<ShopMemDAO> sList = new ShopMemDAO().selectAllList(conn, currentPage);

		return pageData;
	}

	// 업체 지역 설정 목록 띄우기
	public PageData printSearchList(String shopLAdd, String array, int currentPage) {

		Connection conn = null;
		PageData pageData = new PageData();

		ArrayList<ShopMember> cList = new ShopMemDAO().selectSearchList(conn, shopLAdd, array, currentPage);

		return pageData;
	}

	// 업체 정보 상세화면
	public ShopMember printOne(String shopId) {
		Connection conn = null;
		ShopMember shopMember = null;

		shopMember = new ShopMemDAO().selectOne(conn, shopId);

		return null;
	}

	public int deleteShopInfo(String shopId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int registerShopInfo(String shopId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public ShopMember showShopInfo(String shopId) {
		// TODO Auto-generated method stub
		return null;
	}

	public int modifyShop(ShopMember shopMember) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int removeShop(String shopId, char delShopCode) {
		// TODO Auto-generated method stub
		return 0;
	}


	// 정렬된 목록, 필요할지도 모르니까 킵
//	public PageData printArrayList(String array, int currentPage) {
//		Connection conn = null;
//		PageData pageData = new PageData();
//		
//		ArrayList<ShopMemDAO> sList = new ShopMemDAO().selectArrayList(conn, array, currentPage);
//		
//		return pageData;
//	}

}
