package shop.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cakeinfo.model.service.CakeInfoService;
import cakeinfo.model.vo.CakeAndShop;
import cakeinfo.model.vo.CakeInfo;
import cakeinfo.model.vo.PageData;
import review.model.service.ReviewCommService;
import review.model.service.ReviewService;
import review.model.vo.Review;
import review.model.vo.ReviewComment;
import shop.model.service.ShopMemService;
import shop.model.vo.ShopMember;

/**
 * Servlet implementation class ShopDetailServlet
 */
@WebServlet("/shop/detail")
public class ShopDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShopDetailServlet() {
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

		// 업체 정보
		String shopId = null;
		ShopMember shopMember = new ShopMemService().printOne(shopId);

		// 해당업체의 케이크 목록
		PageData pageDataC = new CakeInfoService().printSearchList(shopId, currentPage);
		ArrayList<CakeInfo> cList = pageDataC.getCakeInfoList();

		// 해당업체의 구매후기 목록
		PageData pageDataR = new ReviewService().printSearchList(shopId, currentPage);
		ArrayList<Review> rList = pageDataR.getReview();

		// 해당업체의 후기댓글
		int reviewNo = rList.get(0).getReviewNo();
		ReviewComment reviewComm = new ReviewCommService().printOne(reviewNo);
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
