package it.epicode.be.godfather.model;

import lombok.Data;

@Data
public class Drink implements FoodItem {

	private String name;
	private Double price;
	private Double calories;

	@Override
	public String getMenuItemLine() {
		return this.name + " - calories: " + calories + " - price: " + price;
	}
}
