package it.epicode.be.godfather.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Tavolo {

	private Integer numero;
	private Integer numeroMassimoCoperti;
	private Boolean occupato;
}
