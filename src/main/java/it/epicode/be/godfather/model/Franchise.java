package it.epicode.be.godfather.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Franchise implements MenuItem {

	private String name;
	private Double price;

	public String getMenuItemLine() {
		return this.getName() + " - price: " + getPrice();
	}
}
