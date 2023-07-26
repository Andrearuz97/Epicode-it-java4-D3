package it.epicode.be.godfather.model;

public class PizzaFamilySize implements Pizza {

	private String name;
	private Double price;
	private Double calories;

	public PizzaFamilySize(String name, Double price, Double calories) {
		this.name = name;
		this.price = price;
		this.calories = calories;
	}

	public String getName() {
		return name;
	}

	@Override
	public Double getPrice() {
		return price;
	}

	@Override
	public Double getCalories() {
		return calories;
	}

	@Override
	public String getSize() {
		return "Large";
	}

	@Override
	public String getMenuItemLine() {
		return getName() + " - calories: " + getCalories() + " - price: " + getPrice();
	}
}