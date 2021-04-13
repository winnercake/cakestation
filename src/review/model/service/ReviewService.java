package review.model.service;

import java.sql.Connection;
import java.util.ArrayList;

import cakeinfo.model.vo.PageData;
import common.JDBCTemplate;
import review.model.dao.ReviewDAO;
import review.model.vo.Review;

public class ReviewService {
	private JDBCTemplate factory;

	//등록
	public int registerReview(Review review) {
		Connection conn = null;
		int result = 0;
		
		result = new ReviewDAO().insertReview(conn, review);
		
		return 0;
	}
	
	//수정
	public int modifyReview(Review review) {
		Connection conn = null;
		int result = 0;
		
		result = new ReviewDAO().updateReview(conn, review);
		
		return 0;
	}
	
	//삭제
	public int deleteReview(int reviewNo) {
		Connection conn = null;
		int result = 0;
		
		result = new ReviewDAO().deleteReview(conn, reviewNo);
		
		return 0;
	}
	
	//한개 조회
	public Review printOne(int reviewNo) {
		Connection conn = null;
		Review review = null;
		
		review = new ReviewDAO().selectOne(conn, reviewNo);
		
		return review;
	}

	//케이크 상세화면에 해당 후기를 뿌려주기 위해  작성된 메소드(cakeinfodetailservlet에서 불러옵니다.)
	public PageData printSearchList(int cakeNo, String shopId, int currentPage) {
		Connection conn = null;
		PageData pageData = new PageData();
		
		ArrayList<Review> rList = new ReviewDAO().selectSearchList(conn, cakeNo, shopId, currentPage);
		
		
		return null;
	}

	public PageData printSearchList(String shopId, int currentPage) {
		Connection conn = null;
		PageData pageData = new PageData();
		
		ArrayList<Review> rList = new ReviewDAO().selectSearchList(conn, shopId, currentPage);
		return null;
	}
	
	public PageData printAllReview(int currentPage, String shopId) {
		Connection conn = null;
		PageData pd = new PageData();
		pd.setrList(new ReviewDAO().selectAllReview(conn, currentPage, shopId));
		pd.setPageNavi(new ReviewDAO().getPageNavi(conn, currentPage, shopId));
		return pd;
	}
//		pd.setRcList(new ReviewCommDAO().selectAllComment(conn, currentPage,));
}
