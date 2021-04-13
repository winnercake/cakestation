package order.model.service;

import java.sql.Connection;

import common.JDBCTemplate;
import order.model.dao.ShopOrderDAO;
import order.model.vo.Order;
import order.model.vo.PageData;

public class ShopOrderService {
	// 연결 생성 위해 JDBCTemplate 클래스 객체 생성
	JDBCTemplate factory;

	// 기본생성자로 연결 생성 준비
	public ShopOrderService() {
		factory = JDBCTemplate.getConnection();
	}

	// 주문서 추가
	public int registerOrder(Order order) {
		Connection conn = null;
		int result = 0;

		result = new ShopOrderDAO().insertOrder(conn, order);

		return 0;
	}

	public PageData printAllOrder(int currentPage, String shopId) {
		Connection conn = null;
		PageData pd = new PageData();
		
		pd.setOrderList(new ShopOrderDAO().selectAllOrder(conn, currentPage, shopId));
		pd.setPageNavi(new ShopOrderDAO().getPageNavi(conn, currentPage, shopId));
		
		return pd;
	}

	public int orderCancel(int orderNum) {
		Connection conn = null;
		int result = 0;
		
		result = new ShopOrderDAO().orderDelete(conn, orderNum);
		return result;
	}
}
