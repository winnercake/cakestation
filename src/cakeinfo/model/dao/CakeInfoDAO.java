package cakeinfo.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import cakeinfo.model.vo.CakeAndShop;
import cakeinfo.model.vo.CakeInfo;

//사진가져올때 메인화면 사진은 type값 쿼리에 포함!!!
public class CakeInfoDAO {

	// 케이크 찾기 화면의 전체 리스트 띄우기 및 페이징 처리
	public ArrayList<CakeAndShop> selectAllList(Connection conn, int currentPage) {
		// 쿼리문 작성시 케이크정보 + 업체정보 조인하여 CakeAndShop 객체의 변수 부분 같이 가져오기

		ArrayList<CakeAndShop> cList = null;

		return null;
	}

	public String getPageNavi(Connection conn, int currentPage) {

		return null;
	}

	public int totalCount(Connection conn) {

		return 0;
	}

	// 케이크 검색 버튼 눌렀을 때, 케이크 검색조건 걸기 및 페이징 처리
	public ArrayList<CakeInfo> selectSearchList(Connection conn, String cakeType, String cakePrice, String shopLAdd,
			String dayRec, int currentPage) {
		// 쿼리문 작성시
		StringBuffer query = new StringBuffer();
		// query.append(SELECT * FROM ~ WHERE) // 이러면 선택 안하는 경우는 해결
		// if(cakeType != null)
		// for문 삽입하여 다중선택 시 이용 -> 배열로 받아오는 것 고려
		// query.append(조건절)

		// if...

		// if(array 평점높은순) ?????????????
		// where 조건&&조건... orderby DESC
		// if(array 평점낮은순)
		// where 조건&&조건... orderby ASC
		return null;

		// 페이징 관련 메소드 2개 공유
	}

	// 정렬버튼 바꿨을 때, 케이크 검색조건 걸기 + 정렬조건 및 페이징 처리
	public ArrayList<CakeInfo> selectSearchList(Connection conn, String cakeType, String cakePrice, String shopLAdd,
			String dayRec, String array, int currentPage) {
		// 쿼리문 작성시
		StringBuffer query = new StringBuffer();
		// query.append(SELECT * FROM ~ WHERE) // 이러면 선택 안하는 경우는 해결
		// if(cakeType != null)
		// for문 삽입하여 다중선택 시 이용 -> 배열로 받아오는 것 고려
		// query.append(조건절)

		// if...

		// if(array 평점높은순) ?????????????
		// where 조건&&조건... orderby DESC
		// if(array 평점낮은순)
		// where 조건&&조건... orderby ASC
		return null;
	}

	public String getSearchPageNavi(Connection conn, String cakeType, String cakePrice, String shopLAdd, String dayRec,
			int currentPage) {

		return null;
	}

	public int searchTotalCount(Connection conn, String cakeType, String cakePrice, String shopLAdd, String dayRec) {

		return 0;
	}

	// 케익 상세화면
	public CakeAndShop selectOne(Connection conn, int cakeNo, String shopId) {
		CakeAndShop cakeAndShop = new CakeAndShop();
		// 쿼리로 cake와 해당 업체정보를 조인하여 cakeandshop객체에 담기
		return null;
	}

	// 오버로드, 업체별 케익 목록, 업체 상세화면에서 사용
	public ArrayList<CakeInfo> selectSearchList(Connection conn, String shopId, int currentPage) {

		return null;
	}

	public String getSearchPageNavi(Connection conn, String shopId, int currentPage) {

		return null;
	}

	public int searchTotalCount(Connection conn, String shopId) {

		return 0;
	}
	
	public int insertCakeInfo(Connection conn, CakeInfo cakeInfo) {
		PreparedStatement pstmt = null;
		String query;
		int result = 0;
		
		return result;
	}



	public CakeInfo selectCakeOne(Connection conn, int cakeNo) {
		// TODO Auto-generated method stub
		return null;
	}

	public int modifyCakeInfo(Connection conn, CakeInfo cakeInfo) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteCakeInfo(Connection conn, int cakeNo) {
		// TODO Auto-generated method stub
		return 0;
	}

//		// 케이크 찾기 화면의 정렬 리스트 띄우기 및 페이징 처리, 킵
//		public ArrayList<CakeInfo> selectArrayList(Connection conn, String array, int currentPage) {
//			//array 값에 따라 if문으로 쿼리 2가지 돌리기???
//			return null;
//		}
	//
//		public String getArrayPageNavi(Connection conn, String array, int currentPage) {
//			
//			return null;
//		}
	//
//		public int arrayTotalCount(Connection conn, String search) {
	//
//			return 0;
//		}

}
