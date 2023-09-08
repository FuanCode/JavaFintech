package br.com.fiap.banco;

import java.io.Serializable;

public class Usuario implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	private int rg;
	private int cpf;
	private int telefone;
	private int cep;
	private int id;

	
	
	
	public Usuario() {
		
	}
	
	public Usuario(int rg, int cpf, int telefone, int cep, int id, int password) {
		
		this.rg = rg;
		this.cpf = cpf;
		this.telefone = telefone;
		this.cep = cep;
		this.id = id;

				
		
		
	}
	
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getTelefone() {
		return telefone;
	}
	public void settelefone(int telefone) {
		this.telefone = telefone;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}
	
	
	
	/*
	public void depositar(double valor) {
		
		this.saldo = saldo + valor;
	
	}
	
	public void retirar(double valor) {
		
		this.saldo = saldo - valor;
		
	}
	
	public double getSaldo() {
		
		return this.saldo;
		
	}
	*/
	
	
	
	
	
	
	

}
