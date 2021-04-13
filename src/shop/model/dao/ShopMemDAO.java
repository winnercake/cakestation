package shop.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import common.JDBCTemplate;
import shop.model.vo.ShopMember;

public class ShopMemDAO {

	public ShopMember selectOneMember(Connection conn, String userId, String userPwd) {
		Statement stmt = null;
		ResultSet rset = null;
		String query = "SELECT * FROM SHOP_MEMBER WHERE SHOP_ID = '" + userId + "' AND SHOP_PWD = '" + userPwd + "'";
		ShopMember shopMember = null;
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			if(rset.next()) {
				shopMember.setShopId(rset.getString("SHOP_ID"));
				shopMember.setShopPwd(rset.getString("SHOP_PWD"));
				/////////////////// 마저 채우기
				///////////////////
				///////////////////
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(stmt);
		}
		return shopMember;
	}

	// 회원가입(insert)
	public int insertMember(Connection conn, ShopMember shopMember) {
		PreparedStatement pstmt = null;
		int result = 0;
//		String query = "INSERT INTO SHOP_MEMBER VALUES(" // 컬럼 쓰고 넣는걸로(위도경도등 빼려고)
		
		try {
			pstmt = conn.prepareStatement(null);
			pstmt.setString(1, shopMember.getShopId());
			pstmt.setString(2, shopMember.getShopPwd());
			pstmt.setString(3, shopMember.getShopName());
			pstmt.setString(4, shopMember.getCEOName());
			pstmt.setString(5, shopMember.getShopCRN());
			///////////
			///////////
			///////////
			/////////// 마저 채우기~
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(pstmt);
		}
		return result;
	}
	
	// 전체 목록
	public ArrayList<ShopMemDAO> selectAllList(Connection conn, int currentPage) {

		return null;
	}

	public String getPageNavi(Connection conn, int currentPage) {

		return null;
	}

	public int totalCount(Connection conn) {

		return 0;
	}

	// 케이크 지역 + 평점 정렬 목록
	public ArrayList<ShopMember> selectSearchList(Connection conn, String shopLAdd, String array, int currentPage) {
		// if(shopLAdd가 전체)
		// if(array가 평점높은순)
		// 쿼리: orderby 평점 DESC
		// else if(array가 평점 낮은순>
		// 쿼리: orderby 평점 ASC
		// else //나머지 지역설정 시
		// if(array가 평점높은순)
		// 쿼리: where 지역조건 orderby 평점 DESC
		// else if(array가 평점 낮은순>
		// 쿼리: where 지역조건 orderby 평점 ASC
		return null;
	}

	public String getSearchPageNavi(Connection conn, String shopLAdd, int currentPage) {

		return null;
	}

	public int searchTotalCount(Connection conn, String shopLAdd) {

		return 0;
	}

	// 업체 정보 상세화면
	public ShopMember selectOne(Connection conn, String shopId) {

		return null;
	}

//		필요할지도 모르니까 킵
//		//정렬된 목록
//		public ArrayList<ShopMemDAO> selectArrayList(Connection conn, String array, int currentPage) {
//			//where 서울 orderby 평점 desc/asc
//			return null;
//		}
	//
//		public String getArrayPageNavi(Connection conn, String array, int currentPage) {
//			
//			return null;
//		}
	//
//		public int ArrayTotalCount(Connection conn, String search) {
	//
//			return 0;
//		}

}
