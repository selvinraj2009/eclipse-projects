package com.retailmanagement.vo;

import java.util.List;

public class RetailManagement {
	
	private List<String> offers;
	
	private String selectedProduct;
	
	public String getSelectedProduct() {
		return selectedProduct;
	}

	public void setSelectedProduct(String selectedProduct) {
		this.selectedProduct = selectedProduct;
	}

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
