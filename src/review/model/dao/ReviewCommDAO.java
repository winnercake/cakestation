package review.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import review.model.vo.Review;
import review.model.vo.ReviewComment;

public class ReviewCommDAO {
	public ArrayList<ReviewComment> selectAllComm(ArrayList<Review> nList) {
		Statement stmt = null;
		ResultSet rset = null;
		ArrayList<ReviewComment> rcList = null;
		for (int i = 0; i < nList.size(); i++) {
			String query = "SELECT * FROM REVIEWCOMMENT WHERE" + nList.get(i).getReviewNo();
			rcList = new ArrayList<ReviewComment>();
//			while(rset.next()) {
			ReviewComment reviewComm = new ReviewComment();
			rcList.add(reviewComm);
//			}
		}
		return rcList;
	}

	// 등록
	public int insertReviewComm(Connection conn, ReviewComment reviewComm) {

		return 0;
	}

	// 수정
	public int updateReviewComm(Connection conn, ReviewComment reviewComm) {

		return 0;
	}

	// 삭제
	public int deleteReviewComm(Connection conn, int replyNo) {

		return 0;
	}
//		
//		public int insertComm(Connection conn, ReviewComment reviewComm) {
//			PreparedStatement pstmt = null;
//			int result = 0;
//			String query;
//			
//			return result;
//		}
//	
//		public int modifyComm(Connection conn, ReviewComment reviewComm) {
//			PreparedStatement pstmt = null;
//			int result = 0;
//			String query;
//					
//			return result;
//		}
//	
//		public int deleteComm(Connection conn, int commNum) {
//			PreparedStatement pstmt = null;
//			int result = 0;
//			String query;
//			
//			return 0;
//		}

	// 후기댓글 가져오기
	public ReviewComment selectOne(Connection conn, int reviewNo) {

		return null;
	}

}
