package br.com.fiap.banco;

import java.io.Serializable;

public class Planejamento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int CasaPropria;
	public int getCasaPropria() {
		return CasaPropria;
	}

	public void setCasaPropria(int casaPropria) {
		CasaPropria = casaPropria;
	}
	
	private int Automovel;
	public int getAutomovel() {
		return Automovel;
	}

	public void setAutomovel(int automovel) {
		Automovel = automovel;
	}

	
	private int Viajens;
	public int getViajens() {
		return Viajens;
	}

	public void setViajens(int viajens) {
		Viajens = viajens;
	}

	
	
	
	
	
	
	
}
