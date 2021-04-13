package shop.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import shop.model.service.ShopMemService;
import shop.model.vo.ShopMember;

/**
 * Servlet implementation class ShopLoginServlet
 */
@WebServlet("/shop/login")
public class ShopLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShopLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		String userPwd = request.getParameter("userPwd");
		// 아이디 저장(체크박스) "saveId"
		
		ShopMember sMember = new ShopMemService().selectOneMember(userId, userPwd);
		
		if(sMember!=null && sMember.getShopId()!=null && sMember.getShopPwd()!=null) {
			// 성공
			HttpSession session = request.getSession();
			session.setAttribute("userId", sMember.getShopId());
			response.sendRedirect("/member/loginSuccess.jsp");
		}else {
			// 실패
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
