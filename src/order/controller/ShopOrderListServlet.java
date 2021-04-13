package order.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import order.model.service.ShopOrderService;
import order.model.vo.Order;
import order.model.vo.PageData;

/**
 * Servlet implementation class ShopOrderListServlet
 */
@WebServlet("/shopMy/orderList")
public class ShopOrderListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShopOrderListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(); // 업체로그인 세션정보 가져오기 
		
		if(session != null && (session.getAttribute("shopId") != null)) {
		String shopId = (String)session.getAttribute("shopId"); 
		
		int currentPage = 0; // 현재 페이지 값
		
		PageData pageData = new ShopOrderService().printAllOrder(currentPage, shopId); // 가져올 예약목록 전체와 페이지 네비 값
		ArrayList<Order> orderList = pageData.getOrderList(); // 예약 목록을 5개씩 가져옴
		String pageNavi = pageData.getPageNavi(); // 페이지 네비 1-10
		
		if(!orderList.isEmpty()) {
			request.setAttribute("orderList", orderList);
			request.setAttribute("pageNavi", pageNavi);
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/shopMyPage/shopMyPage");
			view.forward(request, response);
		}else {
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/shopMyPage/shopMyPage");
			view.forward(request, response);
		}
		
		}else {
//		// 로그인을 하지 않았을 경우
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/serviceFailed.html");
		view.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
