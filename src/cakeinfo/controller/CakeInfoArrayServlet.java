package cakeinfo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cakeinfo.model.service.CakeInfoService;
import cakeinfo.model.vo.PageData;

/**
 * Servlet implementation class CakeInfoArrayServlet
 */
@WebServlet("/cake/array")
public class CakeInfoArrayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CakeInfoArrayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int currentPage = 0;
		String cakeType = null;
		String cakePrice = null;
		String shopLAdd = null;
		String dayRec = null;
		String array = null;		
		
		PageData pageData = new CakeInfoService().printSearchList(cakeType, cakePrice, shopLAdd, dayRec, array, currentPage);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
