package order.model.vo;

import java.util.ArrayList;

import cakeinfo.model.vo.CakeInfo;
import review.model.vo.Review;
import review.model.vo.ReviewComment;

public class PageData {

	private ArrayList<CakeInfo> cakeList;
	private ArrayList<Order> orderList;
	private ArrayList<Review> rList;
	private ArrayList<ReviewComment> rcList;
	private String pageNavi;
	
	public PageData() {}

	public ArrayList<Order> getOrderList() {
		return orderList;
	}

	public void setOrderList(ArrayList<Order> orderList) {
		this.orderList = orderList;
	}

	
	public ArrayList<CakeInfo> getCakeList() {
		return cakeList;
	}

	public void setCakeList(ArrayList<CakeInfo> cakeList) {
		this.cakeList = cakeList;
	}

	public ArrayList<Review> getrList() {
		return rList;
	}

	public void setrList(ArrayList<Review> rList) {
		this.rList = rList;
	}

	public ArrayList<ReviewComment> getRcList() {
		return rcList;
	}

	public void setRcList(ArrayList<ReviewComment> rcList) {
		this.rcList = rcList;
	}

	public String getPageNavi() {
		return pageNavi;
	}
	
	public void setPageNavi(String pageNavi) {
		this.pageNavi = pageNavi;
	}

	@Override
	public String toString() {
		return "PageData [cakeList=" + cakeList + ", orderList=" + orderList + ", rList=" + rList + ", rcList=" + rcList
				+ ", pageNavi=" + pageNavi + "]";
	}
	
}
