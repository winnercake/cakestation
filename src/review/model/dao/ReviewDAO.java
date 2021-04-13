package review.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import review.model.vo.Review;

public class ReviewDAO {

	//등록
	public int insertReview(Connection conn, Review review) {
		
		return 0;
	}
	
	//수정
	public int updateReview(Connection conn, Review review) {
		
		return 0;
	}
	
	//삭제	
	public int deleteReview(Connection conn, int reviewNo) {
		
		return 0;
	}
	
	// 한개 조회
	public Review selectOne(Connection conn, int reviewNo) {
		
		return null;
	}

	public ArrayList<Review> selectAllReview(Connection conn, int currentPage, String shopId) {
		Statement stmt = null;
		ResultSet rset = null;
		String query;
		
		int recordCountPerPage = 5;
		int start;
		int end;
		
		ArrayList<Review> rList = new ArrayList<Review>();
		Review review = new Review();
		
		return rList;
		}
		
//
//		public String getPageNavi(Connection conn, int currentPage, String shopId) {
//		int recordTotalCount = totalCount(conn, shopId);
//		int recordCountPerPage = 5;
//		
//		int startNavi;
//		int endNavi;
//		
//		boolean needPrev = true;
//		boolean needNext = true;
//		
//		StringBuilder sb = new StringBuilder();
//		
//		return null;
//	}
//	
//	private int totalCount(Connection conn, String shopId) {
//		Statement stmt = null;
//		ResultSet rset = null;
//		String query;
//		
//		int recordTotalCount = 0;
//		
//		return recordTotalCount;
//	}
	
	// 케이크 상세화면에 해당 후기를 뿌려주기 위해 작성된 메소드(cakeinfodetailservlet에서 불러옵니다.)
	public ArrayList<Review> selectSearchList(Connection conn, int cakeNo, String shopId, int currentPage) {
		// 쿼리: 제품번호, 업체아이디로 후기게시판에서 작성자, 평점, 내용, 작성일, 사진정보 가져오기
		return null;
	}

	public String getSearchPageNavi(Connection conn, int cakeNo, String shopId, int currentPage) {

		return null;
	}

	public int searchTotalCount(Connection conn, int cakeNo, String shopId) {

		return 0;
	}

	// 업체 상세화면에 해당 후기를 뿌려주기 위해 작성된 메소드(shopdetailservlet에서 불러옵니다.)
	public ArrayList<Review> selectSearchList(Connection conn, String shopId, int currentPage) {

		return null;
	}

	public String getSearchPageNavi(Connection conn, String shopId, int currentPage) {

		return null;
	}

	public int searchTotalCount(Connection conn, String shopId) {

		return 0;
	}

	public String getPageNavi(Connection conn, int currentPage, String shopId) {
		// TODO Auto-generated method stub
		return null;
	}
}
