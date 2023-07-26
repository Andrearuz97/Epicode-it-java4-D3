package it.epicode.be.godfather.model;

public class PizzaHawaiian extends PizzaFamilySize {

	public PizzaHawaiian() {
		super("Hawaiian", 7.99, 1000d);
	}

	@Override
	public String getSize() {
		return "Medium";
	}
}