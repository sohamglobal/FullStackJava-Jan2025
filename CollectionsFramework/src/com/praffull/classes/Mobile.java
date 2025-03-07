package com.praffull.classes;

public class Mobile {
	private String modelName;
	private String company;
	private int ram;
	private int internalStorage;
	private String color;
	private float price;
	
	public Mobile(String modelName, String company, int ram, int internalStorage, String color, float price) {
		super();
		this.modelName = modelName;
		this.company = company;
		this.ram = ram;
		this.internalStorage = internalStorage;
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile [modelName=" + modelName + ", company=" + company + ", ram=" + ram + ", internalStorage="
				+ internalStorage + ", color=" + color + ", price=" + price + "]";
	}

	public String getModelName() {
		return modelName;
	}

	public float getPrice() {
		return price;
	}
	
	
	
	

}
