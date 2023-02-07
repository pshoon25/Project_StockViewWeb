package com.StockViewWebsite.manage.dto;

public class ItemOfInterestDTO {
	private String memberId;
	private String stockitemName;
	
	public ItemOfInterestDTO(String memberId, String stockitemName) {
		super();
		this.memberId = memberId;
		this.stockitemName = stockitemName;
	}
	
	@Override
	public String toString() {
		return "ItemOfInterestDTO [memberId=" + memberId + ", stockitemName=" + stockitemName + "]";
	}
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getStockitemName() {
		return stockitemName;
	}
	public void setStockitemName(String stockitemName) {
		this.stockitemName = stockitemName;
	}
}
