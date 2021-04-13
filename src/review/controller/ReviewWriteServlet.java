package review.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import review.model.service.ReviewService;
import review.model.vo.Review;

/**
 * Servlet implementation class ReviewWriteServlet
 */
@WebServlet("/review/write")
public class ReviewWriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReviewWriteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//리뷰작성페이지로 이동
		//hidden으로 제품번호, 제품명 등 업체아이디 가져오고, 리퀘스트로 넘겨줄것// write.html에서 화면에 뿌려줄때 사용, 넘겼다가 다시 hiddent으로 넘겨서 post로 이동
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/review/reviewWrite.html");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		//세션필요 로그인한 경우만 가능
		HttpSession session = request.getSession();
		String memberId = (String)session.getAttribute("memberId");
		
		//String reviewTitle = null;
				//String reivewContent = null;
				//int reviewScore = 0;
				//...
		
		Review review = new Review();
		/* 파일정보도 넘어와서 review에 저장됨 */
		int result = new ReviewService().registerReview(review);
		
		/* result 값 성공하면 케이크 상세페이지로 돌아가기 */
		
		
		
		
	}

}
