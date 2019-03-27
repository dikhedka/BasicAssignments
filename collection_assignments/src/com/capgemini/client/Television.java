package com.capgemini.client;

public class Television {
      
	private String company;
	private String type;
	private boolean enabled_3D;
	private double price;
	
	
	public Television(String company, String type, boolean enabled_3D, double price) {
		super();
		this.company = company;
		this.type = type;
		this.enabled_3D = enabled_3D;
		this.price = price;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public boolean isEnabled_3D() {
		return enabled_3D;
	}


	public void setEnabled_3D(boolean enabled_3d) {
		enabled_3D = enabled_3d;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Television [company=" + company + ", type=" + type + ", enabled_3D=" + enabled_3D + ", price=" + price
				+ "]";
	}

	   
	
	
	
}
