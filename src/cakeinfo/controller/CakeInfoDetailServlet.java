package cakeinfo.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cakeinfo.model.service.CakeInfoService;
import cakeinfo.model.vo.CakeAndShop;
import cakeinfo.model.vo.PageData;
import review.model.service.ReviewCommService;
import review.model.service.ReviewService;
import review.model.vo.Review;
import review.model.vo.ReviewComment;

/**
 * Servlet implementation class CakeInfoDetailServlet
 */
@WebServlet("/cake/detail")
public class CakeInfoDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CakeInfoDetailServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int currentPage = 0;

		// cakeinfolist.jsp에서 넘어옴
		int cakeNo = 0; // jsp arraylist값에서 가져옴
		String shopId = null; // 상동

		// 케익정보
		CakeAndShop cakeAndShop = new CakeInfoService().printOne(cakeNo, shopId);

		// 해당 케익의 후기
		PageData pageData = new ReviewService().printSearchList(cakeNo, shopId, currentPage);
		ArrayList<Review> rList = pageData.getReview();
		// if(cakeInfo != null) 페이지 이동

		// 해당 케익의 후기의 댓글
		int reviewNo = rList.get(0).getReviewNo();
		ReviewComment reviewComm = new ReviewCommService().printOne(reviewNo);

		// setAttribute로 다 넣어서 detail.jsp로 이동
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
