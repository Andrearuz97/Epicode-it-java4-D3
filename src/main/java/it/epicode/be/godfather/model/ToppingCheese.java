package it.epicode.be.godfather.model;

public class ToppingCheese extends PizzaTopping implements FoodItem {

	public ToppingCheese(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getName() {
		return "Cheese";
	}

	@Override
	public Double getPrice() {
		Double price = super.getPrice();
		return (price != null) ? price : getDefaultPrice();
	}

	@Override
	public Double getCalories() {
		return 50.0;
	}

	@Override
	public String getMenuItemLine() {
		return getName() + " - calories: " + getCalories() + " - price: " + getPrice();
	}
}
