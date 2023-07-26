package it.epicode.be.godfather.model;

public interface MenuItem {
	String getName();

	Double getPrice();

	default Double getDefaultPrice() {
		return 0.0;
	}

	String getMenuItemLine();
}
