package it.epicode.be.godfather;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import it.epicode.be.godfather.config.MenuConfig;
import it.epicode.be.godfather.model.Menu;
import lombok.extern.slf4j.Slf4j;

@Slf4j

public class GestioneMenu {

	private Menu menu;
	private AnnotationConfigApplicationContext ctx;

	public GestioneMenu() {
		ctx = new AnnotationConfigApplicationContext(MenuConfig.class);
		menu = (Menu) ctx.getBean("menu");
	}

	public void stampaMenu() {
		log.info("******* Menu *******");

		log.info("PIZZA");
		menu.getMenuPizza().forEach(p -> log.info(p.getMenuItemLine()));
		log.info("");

		log.info("DRINK");
		menu.getMenuDrink().forEach(p -> log.info(p.getMenuItemLine()));
		log.info("");

		log.info("FRANCHISE");
		menu.getMenuFranchise().forEach(p -> log.info(p.getMenuItemLine()));
	}

	public static void main(String[] args) {
		GestioneMenu gestioneMenu = new GestioneMenu();
		gestioneMenu.stampaMenu();
	}
}
