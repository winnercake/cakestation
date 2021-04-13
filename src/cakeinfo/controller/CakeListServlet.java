package cakeinfo.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cakeinfo.model.service.CakeInfoService;
import cakeinfo.model.vo.CakeInfo;
import order.model.vo.PageData;

/**
 * Servlet implementation class CakeListServlet
 */
@WebServlet("/shopMy/cakeList")
public class CakeListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CakeListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(); // 업체로그인 세션정보 가져오기 
		String shopId = (String)session.getAttribute("shopId"); 
		int currentPage = 0; // 현재 페이지 값
		PageData pageData = new CakeInfoService().printAllCake(currentPage, shopId);
		
		ArrayList<CakeInfo> cList = pageData.getCakeList();
		String pageNavi = pageData.getPageNavi();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
