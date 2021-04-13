package shop.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shop.model.service.ShopMemService;
import shop.model.vo.ShopMember;

/**
 * Servlet implementation class ShopEnrollServlet
 */
@WebServlet("/shop/enroll")
public class ShopEnrollServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShopEnrollServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		// 비밀번호 확인 "user-pwd-re" 추가
		
		ShopMember shopMember = new ShopMember();
		shopMember.setShopId(request.getParameter("user-id"));
		shopMember.setShopPwd(request.getParameter("user-pwd"));
		shopMember.setShopName(request.getParameter("user-shop-name"));
		shopMember.setCEOName(request.getParameter("user-name"));
		shopMember.setShopLAdd(request.getParameter("user-L-add"));
		shopMember.setShopMAdd(request.getParameter("user-M-add"));
		shopMember.setShopSAdd(request.getParameter("user-S-add"));
		shopMember.setShopPhone(request.getParameter("user-phone"));
		shopMember.setShopEmail(request.getParameter("user-email"));
		shopMember.setShopCRN(request.getParameter("user-crn"));
//		shopMember.setBank(request.getParameter("user-bank"));
//		shopMember.setAccountNum(request.getParameter("user-accountNo"));
//		shopMember.setDepositor(request.getParameter("user-depositor"));
//		shopMember.setShopRecieve(request.getParameter("agree").charAt(0));
		
		int result = new ShopMemService().registerMember(shopMember);
		
		if(result > 0) {
			response.sendRedirect("/index.jsp");
		}else {
			response.sendRedirect("/member/memberError.html");
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
