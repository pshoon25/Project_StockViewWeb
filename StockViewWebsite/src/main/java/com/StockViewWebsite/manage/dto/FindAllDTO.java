package com.StockViewWebsite.manage.dto;

public class FindAllDTO {
	private String itemCode;
	private String stockItemName;
	private String marketSegmentation;
	private String presence;
	private Integer closingPrice;
	private Integer prepare;
	private Double fluctuationRate;
	private Integer openPrice;
	private Integer highPrice;
	private Integer lowPrice;
	private Integer tradingVolume;
	private Integer transactionAmount;
	
	public FindAllDTO() {}

	public FindAllDTO(String itemCode, String stockItemName, String marketSegmentation, String presence,
			Integer closingPrice, Integer prepare, Double fluctuationRate, Integer openPrice, Integer highPrice,
			Integer lowPrice, Integer tradingVolume, Integer transactionAmount) {
		super();
		this.itemCode = itemCode;
		this.stockItemName = stockItemName;
		this.marketSegmentation = marketSegmentation;
		this.presence = presence;
		this.closingPrice = closingPrice;
		this.prepare = prepare;
		this.fluctuationRate = fluctuationRate;
		this.openPrice = openPrice;
		this.highPrice = highPrice;
		this.lowPrice = lowPrice;
		this.tradingVolume = tradingVolume;
		this.transactionAmount = transactionAmount;
	}

	@Override
	public String toString() {
		return "FindAllDTO [itemCode=" + itemCode + ", stockItemName=" + stockItemName + ", marketSegmentation="
				+ marketSegmentation + ", presence=" + presence + ", closingPrice=" + closingPrice + ", prepare="
				+ prepare + ", fluctuationRate=" + fluctuationRate + ", openPrice=" + openPrice + ", highPrice="
				+ highPrice + ", lowPrice=" + lowPrice + ", tradingVolume=" + tradingVolume + ", transactionAmount="
				+ transactionAmount + "]";
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getStockItemName() {
		return stockItemName;
	}

	public void setStockItemName(String stockItemName) {
		this.stockItemName = stockItemName;
	}

	public String getMarketSegmentation() {
		return marketSegmentation;
	}

	public void setMarketSegmentation(String marketSegmentation) {
		this.marketSegmentation = marketSegmentation;
	}

	public String getPresence() {
		return presence;
	}

	public void setPresence(String presence) {
		this.presence = presence;
	}

	public Integer getClosingPrice() {
		return closingPrice;
	}

	public void setClosingPrice(Integer closingPrice) {
		this.closingPrice = closingPrice;
	}

	public Integer getPrepare() {
		return prepare;
	}

	public void setPrepare(Integer prepare) {
		this.prepare = prepare;
	}

	public Double getFluctuationRate() {
		return fluctuationRate;
	}

	public void setFluctuationRate(Double fluctuationRate) {
		this.fluctuationRate = fluctuationRate;
	}

	public Integer getOpenPrice() {
		return openPrice;
	}

	public void setOpenPrice(Integer openPrice) {
		this.openPrice = openPrice;
	}

	public Integer getHighPrice() {
		return highPrice;
	}

	public void setHighPrice(Integer highPrice) {
		this.highPrice = highPrice;
	}

	public Integer getLowPrice() {
		return lowPrice;
	}

	public void setLowPrice(Integer lowPrice) {
		this.lowPrice = lowPrice;
	}

	public Integer getTradingVolume() {
		return tradingVolume;
	}

	public void setTradingVolume(Integer tradingVolume) {
		this.tradingVolume = tradingVolume;
	}

	public Integer getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(Integer transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	
	
}
