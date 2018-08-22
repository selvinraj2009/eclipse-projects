package com.retailmanagement.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.retailmanagement.vo.RetailManagement;


@Controller
public class RetailManagementController {
	
	
	private static final String PLEASE_SELECT= "Please Select a Product";
	
	
	@RequestMapping(value="offers", method=RequestMethod.GET)
	public String viewOffers(Model model) {
		RetailManagement retailManagement = new RetailManagement();
		retailManagement.setOffers(generateProductList());
		model.addAttribute("retailManagement",retailManagement );
		return "offers";
	}
	
	
	@RequestMapping(value="/getCoupons", method=RequestMethod.POST)
	public String viewCoupons(@ModelAttribute("retailManagement") RetailManagement retailManagement, Model model) {
	
		if(!PLEASE_SELECT.equals(retailManagement.getSelectedProduct())) {
			model.addAttribute("selectedCoupon",generateCoupons().get(retailManagement.getSelectedProduct()));
			return "coupon";	
		}else {
			return "error";
		}
	}
	
	private List<String> generateProductList(){
		List<String> offers = new ArrayList<String>();
		offers.add("Please Select a Product");
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
