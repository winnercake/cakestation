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
import cakeinfo.model.vo.CakeInfo;
import cakeinfo.model.vo.PageData;

/**
 * Servlet implementation class CakeInfoListServlet
 */
@WebServlet("/cake/list")
public class CakeInfoListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CakeInfoListServlet() {
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

		PageData pageData = new CakeInfoService().printAllList(currentPage); // 페이징 처리 전
		ArrayList<CakeInfo> cList = pageData.getCakeInfoList();
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
