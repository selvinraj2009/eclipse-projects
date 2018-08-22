package com.retailmanagement.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RetailManagementController {

	
	
	
	
	
	
	private List<String> generateProductList(){
		List<String> offers = new ArrayList<String>();
		offers.add("Clothing");
		offers.add("Home Appliances");
		offers.add("Electronical and Electronic Items");
		offers.add("Furnitures");
		return offers;
	}
	
	private Map<String, String> generateCoupons(){
		Map<String, String> coupons= new HashMap<String,String>();
		coupons.put("Clothing", "CLOTHOFF50");
		coupons.put("Home Appliances", "HOMEOFF70");
		coupons.put("Electronical and Electronic Items", "ELEC30");
		coupons.put("Furnitures","FUROFF40");
		
		
		return coupons;
	}
}
