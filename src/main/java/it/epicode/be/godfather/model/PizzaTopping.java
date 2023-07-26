package it.epicode.be.godfather.model;

public abstract class PizzaTopping implements Pizza {

	private Pizza pizza;

	public PizzaTopping(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getName() {
		return pizza.getName();
	}

	@Override
	public Double getPrice() {
		return pizza.getPrice();
	}

	@Override
	public String getSize() {
		return pizza.getSize();
	}
}