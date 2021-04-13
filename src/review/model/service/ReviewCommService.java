package review.model.service;

import java.sql.Connection;
import java.util.ArrayList;

import common.JDBCTemplate;
import review.model.dao.ReviewCommDAO;
import review.model.vo.Review;
import review.model.vo.ReviewComment;

public class ReviewCommService {

	// 연결 생성 위해 JDBCTemplate 클래스 객체 생성
	JDBCTemplate factory;

	// 기본생성자로 연결 생성 준비
	public ReviewCommService() {
		factory = JDBCTemplate.getConnection();
	}
	
	public ArrayList<ReviewComment> printAllComm(ArrayList<Review> rList) {
		Connection conn = null;
		ArrayList<ReviewComment> rcList = null;
		
		rcList = new ReviewCommDAO().selectAllComm(rList);
		
		return rcList;
	}

//		public int enrollComm(ReviewComment reviewComm) {
//		Connection conn = null;
//		int result = 0;
//		result = new ReviewCommDAO().insertComm(conn, reviewComm);
//		return 0;
//	}
//	
//	public int updateComm(ReviewComment reviewComm) {
//		Connection conn = null;
//		int result = 0;
//		result = new ReviewCommDAO().modifyComm(conn, reviewComm);
//		
//		return result;
//	}
//	
//	public int deleteComm(int commNum) {
//		Connection conn = null;
//		int result = 0;
//		result = new ReviewCommDAO().deleteComm(conn, commNum);
//		
//		return result;
//	}
	
	// 등록
	public int registerReviewComm(ReviewComment reviewComm) {
		Connection conn = null;
		int result = 0;

		result = new ReviewCommDAO().insertReviewComm(conn, reviewComm);

		return 0;
	}

	// 수정
	public int modifyReviewComm(ReviewComment reviewComm) {
		Connection conn = null;
		int result = 0;

		result = new ReviewCommDAO().updateReviewComm(conn, reviewComm);

		return 0;
	}

	// 삭제
	public int deleteReviewComm(int replyNo) {
		Connection conn = null;
		int result = 0;

		result = new ReviewCommDAO().deleteReviewComm(conn, replyNo);

		return 0;
	}

	// 후기댓글 가져오기
	public ReviewComment printOne(int reviewNo) {
		Connection conn = null;

		ReviewComment reviewComm = new ReviewCommDAO().selectOne(conn, reviewNo);

		return null;
	}
}
