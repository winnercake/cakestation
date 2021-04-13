package order.model.vo;

import java.sql.Date;

public class Order {
	private int orderNo;
	private String request;
	private String deliveryType;
	private char payType;
	private Date deliveryDate;
	private String pickupTime;
	private Date orderDate;
	private String memberId;
	private int cakeNo;
	private String shopId;
	
	public Order() {}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public String getRequest() {
		return request;
	}

	public void setRequest(String request) {
		this.request = request;
	}

	public String getDeliveryType() {
		return deliveryType;
	}

	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

	public char getPayType() {
		return payType;
	}

	public void setPayType(char payType) {
		this.payType = payType;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getPickupTime() {
		return pickupTime;
	}

	public void setPickupTime(String pickupTime) {
		this.pickupTime = pickupTime;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public int getCakeNo() {
		return cakeNo;
	}

	public void setCakeNo(int cakeNo) {
		this.cakeNo = cakeNo;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	@Override
	public String toString() {
		return "Order [orderNo=" + orderNo + ", request=" + request + ", deliveryType=" + deliveryType + ", payType="
				+ payType + ", deliveryDate=" + deliveryDate + ", pickupTime=" + pickupTime + ", orderDate=" + orderDate
				+ ", memberId=" + memberId + ", cakeNo=" + cakeNo + ", shopId=" + shopId + "]";
	}

}
