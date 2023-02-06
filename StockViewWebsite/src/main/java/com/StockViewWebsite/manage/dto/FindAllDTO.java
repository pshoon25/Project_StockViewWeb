package com.StockViewWebsite.manage.dto;

public class FindAllDTO {
	private String itemCode;
	private String stockItemName;
	private String marketSegmentation;
	private String presence;
	private String closingPrice;
	private String prepare;
	private String fluctuationRate;
	private String openPrice;
	private String highPrice;
	private String lowPrice;
	private String tradingVolume;
	private String transactionAmount;
	
	public FindAllDTO() {}

	public FindAllDTO(String itemCode, String stockItemName) {
		super();
		this.itemCode = itemCode;
		this.stockItemName = stockItemName;
	}

	public FindAllDTO(String itemCode, String stockItemName, String marketSegmentation, String presence,
			String closingPrice, String prepare, String fluctuationRate, String openPrice, String highPrice,
			String lowPrice, String tradingVolume, String transactionAmount) {
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

	public String getClosingPrice() {
		return closingPrice;
	}

	public void setClosingPrice(String closingPrice) {
		this.closingPrice = closingPrice;
	}

	public String getPrepare() {
		return prepare;
	}

	public void setPrepare(String prepare) {
		this.prepare = prepare;
	}

	public String getFluctuationRate() {
		return fluctuationRate;
	}

	public void setFluctuationRate(String fluctuationRate) {
		this.fluctuationRate = fluctuationRate;
	}

	public String getOpenPrice() {
		return openPrice;
	}

	public void setOpenPrice(String openPrice) {
		this.openPrice = openPrice;
	}

	public String getHighPrice() {
		return highPrice;
	}

	public void setHighPrice(String highPrice) {
		this.highPrice = highPrice;
	}

	public String getLowPrice() {
		return lowPrice;
	}

	public void setLowPrice(String lowPrice) {
		this.lowPrice = lowPrice;
	}

	public String getTradingVolume() {
		return tradingVolume;
	}

	public void setTradingVolume(String tradingVolume) {
		this.tradingVolume = tradingVolume;
	}

	public String getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(String transactionAmount) {
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
	
	
	
}
