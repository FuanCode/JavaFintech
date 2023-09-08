package br.com.fiap.banco;

import java.io.Serializable;

public class Financeiro implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private int GastosUsuario;
	public int getGastosUsuario() {
		return GastosUsuario;
	}


	public void setGastosUsuario(int gastosUsuario) {
		GastosUsuario = gastosUsuario;
	}
	
	
	private int Salario;
	public int getSalario() {
		return Salario;
	}


	public void setSalario(int salario) {
		Salario = salario;
	}

	
	private int FreeLancers;
	public int getFreeLancers() {
		return FreeLancers;
	}


	public void setFreeLancers(int freeLancers) {
		FreeLancers = freeLancers;
	}

	public int getContasEssenciais() {
		return ContasEssenciais;
	}


	public void setContasEssenciais(int contasEssenciais) {
		ContasEssenciais = contasEssenciais;
	}

	private int ContasEssenciais;
	
	
	
	
	
	
	
	
}
