package cakeinfo.model.vo;

import java.util.ArrayList;

import review.model.vo.Review;
import shop.model.vo.ShopMember;

public class PageData {

	private ArrayList<CakeInfo> cakeInfoList;
	private ArrayList<ShopMember> shopMemList;
	private ArrayList<Review> review;
	ArrayList<CakeAndShop> cakeAndShop;
	
	private String pageNavi;
	
	
	public PageData() {}
	
	public ArrayList<CakeInfo> getCakeInfoList() {
		return cakeInfoList;
	}
	public void setCakeInfoList(ArrayList<CakeInfo> cakeInfoList) {
		this.cakeInfoList = cakeInfoList;
	}
	public ArrayList<ShopMember> getShopMemList() {
		return shopMemList;
	}
	public void setShopMemList(ArrayList<ShopMember> shopMemList) {
		this.shopMemList = shopMemList;
	}
	public ArrayList<Review> getReview() {
		return review;
	}
	public void setReview(ArrayList<Review> review) {
		this.review = review;
	}
	public String getPageNavi() {
		return pageNavi;
	}
	public void setPageNavi(String pageNavi) {
		this.pageNavi = pageNavi;
	}

	public ArrayList<CakeAndShop> getCakeAndShop() {
		return cakeAndShop;
	}

	public void setCakeAndShop(ArrayList<CakeAndShop> cakeAndShop) {
		this.cakeAndShop = cakeAndShop;
	}

	public void setrList(ArrayList<Review> selectAllReview) {
		// TODO Auto-generated method stub
		
	}

	public ArrayList<Review> getrList() {
		// TODO Auto-generated method stub
		return null;
	}

}
