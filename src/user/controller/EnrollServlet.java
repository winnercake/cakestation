package user.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import customer.model.service.CustomerService;
import user.model.vo.CustomerMember;

/**
 * Servlet implementation class EnrollServlet
 */
@WebServlet("/member/enroll")
public class EnrollServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnrollServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
request.setCharacterEncoding("UTF-8");
		
//Member 객체에 담아서 한번에 넘겨주기
		CustomerMember cMember = new CustomerMember();
		cMember.setMemberId(request.getParameter("user-id"));
		cMember.setMemberPwd(request.getParameter("user-pwd"));
		cMember.setMemberName(request.getParameter("user-name"));
		cMember.setMemberEmail(request.getParameter("user-email"));
		cMember.setMemberAddress(request.getParameter("user-address"));
		cMember.setMemberPhone(request.getParameter("user-phone"));
		cMember.setMemberType(request.getParameter("user-type"));
		cMember.setMemberRecieve(request.getParameter("agree"));
		//타입..(C), 가입일시
		
		int result = new CustomerService().registerMember(cMember);
		if(result > 0) {
			response.sendRedirect("/index.jsp"); // 메인으로 이동
		}else {
			response.sendRedirect("/member/memberError.html"); // 실패 페이지
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
