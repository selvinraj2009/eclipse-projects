package com.retailmanagement.vo;

import java.util.List;

public class RetailManagement {
	
	private List<String> offers;

	
	
	public List<String> getOffers() {
		return offers;
	}

	public void setOffers(List<String> offers) {
		this.offers = offers;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(offers);
		return builder.toString();
	}
}
