package it.epicode.be.godfather.model;

public class ToppingHam extends PizzaTopping implements FoodItem {

	public ToppingHam(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getName() {
		return "Ham";
	}

	@Override
	public Double getPrice() {
		Double price = super.getPrice();
		return (price != null) ? price : getDefaultPrice();
	}

	@Override
	public Double getCalories() {
		return 70.0;
	}

	@Override
	public String getMenuItemLine() {
		return getName() + " - calories: " + getCalories() + " - price: " + getPrice();
	}
}
