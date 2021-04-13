package cakeinfo.model.vo;

import java.sql.Timestamp;

public class CakeAndShop {
	private int cakeNo;
	private String shopId;
	private String cakeName;
	private int cakePrice;
	private String cakeChar;
	private char dayRec; //수령방법
	private char dayPickUp; //당일 수령가능 여부
	private String cakeThema;
	private int cakeAvgScore;
	private String cakeFilePath;
	private long cakeFileSize;
	private Timestamp cakeUploadTime;
	private String cakeFileName;
	//업체명, 업체 위치
	private String shopName;
	private String shopLAdd;
	private String shopMAdd;
	private String shopSAdd;
	private String shopUrl;
	
	public CakeAndShop() {}

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

	public String getCakeName() {
		return cakeName;
	}

	public void setCakeName(String cakeName) {
		this.cakeName = cakeName;
	}

	public int getCakePrice() {
		return cakePrice;
	}

	public void setCakePrice(int cakePrice) {
		this.cakePrice = cakePrice;
	}

	public String getCakeChar() {
		return cakeChar;
	}

	public void setCakeChar(String cakeChar) {
		this.cakeChar = cakeChar;
	}

	public char getDayRec() {
		return dayRec;
	}

	public void setDayRec(char dayRec) {
		this.dayRec = dayRec;
	}

	public char getDayPickUp() {
		return dayPickUp;
	}

	public void setDayPickUp(char dayPickUp) {
		this.dayPickUp = dayPickUp;
	}

	public String getCakeThema() {
		return cakeThema;
	}

	public void setCakeThema(String cakeThema) {
		this.cakeThema = cakeThema;
	}

	public int getCakeAvgScore() {
		return cakeAvgScore;
	}

	public void setCakeAvgScore(int cakeAvgScore) {
		this.cakeAvgScore = cakeAvgScore;
	}

	public String getCakeFilePath() {
		return cakeFilePath;
	}

	public void setCakeFilePath(String cakeFilePath) {
		this.cakeFilePath = cakeFilePath;
	}

	public long getCakeFileSize() {
		return cakeFileSize;
	}

	public void setCakeFileSize(long cakeFileSize) {
		this.cakeFileSize = cakeFileSize;
	}

	public Timestamp getCakeUploadTime() {
		return cakeUploadTime;
	}

	public void setCakeUploadTime(Timestamp cakeUploadTime) {
		this.cakeUploadTime = cakeUploadTime;
	}

	public String getCakeFileName() {
		return cakeFileName;
	}

	public void setCakeFileName(String cakeFileName) {
		this.cakeFileName = cakeFileName;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopLAdd() {
		return shopLAdd;
	}

	public void setShopLAdd(String shopLAdd) {
		this.shopLAdd = shopLAdd;
	}

	public String getShopMAdd() {
		return shopMAdd;
	}

	public void setShopMAdd(String shopMAdd) {
		this.shopMAdd = shopMAdd;
	}

	public String getShopSAdd() {
		return shopSAdd;
	}

	public void setShopSAdd(String shopSAdd) {
		this.shopSAdd = shopSAdd;
	}

	public String getShopUrl() {
		return shopUrl;
	}

	public void setShopUrl(String shopUrl) {
		this.shopUrl = shopUrl;
	}

	@Override
	public String toString() {
		return "CakeAndShop [cakeNo=" + cakeNo + ", shopId=" + shopId + ", cakeName=" + cakeName + ", cakePrice="
				+ cakePrice + ", cakeChar=" + cakeChar + ", dayRec=" + dayRec + ", dayPickUp=" + dayPickUp
				+ ", cakeThema=" + cakeThema + ", cakeAvgScore=" + cakeAvgScore + ", cakeFilePath=" + cakeFilePath
				+ ", cakeFileSize=" + cakeFileSize + ", cakeUploadTime=" + cakeUploadTime + ", cakeFileName="
				+ cakeFileName + ", shopName=" + shopName + ", shopLAdd=" + shopLAdd + ", shopMAdd=" + shopMAdd
				+ ", shopSAdd=" + shopSAdd + ", shopUrl=" + shopUrl + "]";
	}

}
