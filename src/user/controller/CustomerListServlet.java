package user.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import user.model.service.AdminService;
import user.model.service.CustomerService;
import user.model.vo.CustomerMember;

/**
 * Servlet implementation class ListServlet
 */
@WebServlet("/member/customerList")
public class CustomerListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<CustomerMember> cList = new AdminService().selectCustomerList();
		 
		 if(!cList.isEmpty()) {
			 request.setAttribute("cList", cList);
			 RequestDispatcher view = request.getRequestDispatcher("/member/CustomerList.jsp");
			 view.forward(request, response);
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
