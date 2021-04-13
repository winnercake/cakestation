package cakeinfo.model.service;

import java.sql.Connection;
import java.util.ArrayList;

import cakeinfo.model.dao.CakeInfoDAO;
import cakeinfo.model.vo.CakeAndShop;
import cakeinfo.model.vo.CakeInfo;
import cakeinfo.model.vo.PageData;
import common.JDBCTemplate;

public class CakeInfoService {

	private JDBCTemplate factory;

	public CakeInfoService() {
		factory = JDBCTemplate.getConnection();
	}

	// 케이크 찾기 화면의 케이크 전체 리스트 띄우기
	public PageData printAllList(int currentPage) {
		Connection conn = null;
		PageData pageData = new PageData();

		ArrayList<CakeAndShop> cList = new CakeInfoDAO().selectAllList(conn, currentPage);

		return pageData;
	}

	// 케이크 검색 버튼 눌렀을 대
	public PageData printSearchList(String cakeType, String cakePrice, String shopLAdd, String dayRec,
			int currentPage) {
		Connection conn = null;
		PageData pageData = new PageData();

		ArrayList<CakeInfo> cList = new CakeInfoDAO().selectSearchList(conn, cakeType, cakePrice, shopLAdd, dayRec,
				currentPage);

		pageData.setCakeInfoList(cList);

		return pageData;
	}

	public PageData printSearchList(String cakeType, String cakePrice, String shopLAdd, String dayRec, String array,
			int currentPage) {
		Connection conn = null;
		PageData pageData = new PageData();

		ArrayList<CakeInfo> cList = new CakeInfoDAO().selectSearchList(conn, cakeType, cakePrice, shopLAdd, dayRec,
				array, currentPage);

		pageData.setCakeInfoList(cList);

		return pageData;
	}

	// 케이크 상세페이지에 나올 것
	public CakeAndShop printOne(int cakeNo, String shopId) {
		Connection conn = null;
		CakeAndShop cakeAndShop = null;

		cakeAndShop = new CakeInfoDAO().selectOne(conn, cakeNo, shopId);
		return cakeAndShop;
	}

	// 오버로딩, 업체 상세화면에 케이크 목록을 띄울 때 사용
	public PageData printSearchList(String shopId, int currentPage) {
		Connection conn = null;
		PageData pageData = new PageData();

		ArrayList<CakeInfo> cList = new CakeInfoDAO().selectSearchList(conn, shopId, currentPage);

		pageData.setCakeInfoList(cList);
		// pageData.set
		return pageData;

	}

	// 케익 등록 메소드
	public int registerCakeInfo(CakeInfo cakeInfo) {
		Connection conn = null;
		int result = 0;

		result = new CakeInfoDAO().insertCakeInfo(conn, cakeInfo);

		return result;
	}

	public CakeInfo printCakeOne(int cakeNo) {
		Connection conn = null;
		CakeInfo cakeOne = new CakeInfoDAO().selectCakeOne(conn, cakeNo);
		return cakeOne;
	}

	public int updateCakeInfo(CakeInfo cakeInfo) {
		Connection conn = null;
		int result = new CakeInfoDAO().modifyCakeInfo(conn, cakeInfo);
		return result;
	}

	public int deleteCakeOn(int cakeNo) {
		Connection conn = null;
		int result = new CakeInfoDAO().deleteCakeInfo(conn, cakeNo);
		return result;
	}

	public order.model.vo.PageData printAllCake(int currentPage, String shopId) {
		// TODO Auto-generated method stub
		return null;
	}

//		//정렬목록, 킵
//		public PageData printArrayList(String array, int currentPage) {
//			Connection conn = null;
//			PageData pageData = new PageData();
//			
//			ArrayList<CakeInfo> cList = new CakeInfoDAO().selectArrayList(conn, array, currentPage);
//			
//			pageData.setCakeInfoList(cList);
//			return pageData;
//		}	

}
