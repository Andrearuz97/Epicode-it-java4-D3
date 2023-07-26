package it.epicode.be.godfather.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public abstract class PizzaBase implements Pizza {
	private final String name;
	private final Double price;
	private final Double calories;

	@Override
	public String getMenuItemLine() {
		return this.name + " - calories: " + calories + " - price: " + price;
	}
}
