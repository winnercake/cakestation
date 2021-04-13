package order.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import order.model.vo.Order;

public class ShopOrderDAO {

	// 주문전체 리스트 가져오기
	public ArrayList<Order> selectAllOrder(Connection conn, int currentPage, String shopId) {

		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Order> orderAllList = null;
		String query; // 역순 정렬 ( 최신순 )

		int recordCountPerPage = 10; // 한 페이지당 보여줄 게시물 갯수
		int start; // 시작 페이지
		int end; // 마지막 페이지

		Order order = new Order(); // 주문 사항 담을 Order 객체 생성

		return orderAllList; // orderAllList 에 담아 리턴
	}

	// 주문삽입
	public int insertOrder(Connection conn, Order order) {

		return 0;
	}

	public int orderDelete(Connection conn, int orderNum) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "";

		return result;
	}

	// 페이지 네비게이션 구현
	public String getPageNavi(Connection conn, int currentPage, String shopId) {

		int recordTotalCount = totalCount(conn, shopId); // 전체 게시물 갯수
		int recordCountPerPage = 10; // 한 페이지당 보여줄 게시물 갯수
		int pageTotalCount = 0; // 전체 페이지 갯수

		int naviCountPerPage = 10; // 현재페이지에서 보여질 페이지 네비 갯수
		int startNavi;
		int endNavi;

		boolean needPrev = true;
		boolean needNext = true;

		StringBuilder sb = new StringBuilder(); // i 값(페이지 네비값) 누적을 위해 StringBuilder 사용

		return sb.toString();
	}

	public int totalCount(Connection conn, String shopId) {
		Statement stmt = null;
		ResultSet rset = null;
		String query = "";

		int recordTotalCount = 0; // 전체 주문목록 갯수

		return recordTotalCount;
	}

}
