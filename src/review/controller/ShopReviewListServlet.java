package review.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cakeinfo.model.vo.PageData;
import review.model.service.ReviewCommService;
import review.model.service.ReviewService;
import review.model.vo.Review;
import review.model.vo.ReviewComment;

/**
 * Servlet implementation class shopReviewList
 */
@WebServlet("/shopMy/reviewList")
public class ShopReviewListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShopReviewListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String shopId = (String)session.getAttribute("shopId");
		
		int currentPage = 0;
		// currentPage 값을 가져오지 못했을 때  
//		if(request.getParameter("currentPage") == null) {
//			currentPage = 1;
//		}else {
//			currentPage = Integer.parseInt(request.getParameter("currentPage"));
//		}
		
		PageData pageData = new ReviewService().printAllReview(currentPage, shopId);
		ArrayList<Review> rList = pageData.getrList();
		String pageNavi = pageData.getPageNavi();
		
		ArrayList<ReviewComment> rcList = new ReviewCommService().printAllComm(rList);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
