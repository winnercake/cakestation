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
 * Servlet implementation class CakeInfoSearchServlet
 */
@WebServlet("/cake/search")
public class CakeInfoSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CakeInfoSearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    //케이크검색 버튼 눌렀을 때
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int currentPage = 0;
		String cakeType = null;
		String cakePrice = null;
		String shopLAdd = null;
		String dayRec = null;	
		
		PageData pageData = new CakeInfoService().printSearchList(cakeType, cakePrice, shopLAdd, dayRec, currentPage);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
