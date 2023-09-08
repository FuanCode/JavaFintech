package br.com.fiap.banco;

import java.io.Serializable;

public class Teste implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		
		
		/*setando dados usuario*/
		Usuario uu = new Usuario();
		Pessoa pp = new Pessoa();
		uu.setid(44455);
		pp.setEmail("xxx@xx.xx");
		pp.setSenha(5552);
		/*setando dados usuario*/
		
		/*setando o financeiro*/
		Financeiro ff = new Financeiro();
		ff.setSalario(5000);
		ff.setFreeLancers(1000);
		ff.setContasEssenciais(2800);
		ff.setGastosUsuario(670);
		/*setando o financeiro*/
		
		/*setando o planejamento*/
		Planejamento pl = new Planejamento();
		pl.setAutomovel(35000);
		pl.setCasaPropria(350000);
		pl.setViajens(8500);
		/*setando o planejamento*/
		
		/*calculos*/
		
		/*Calculo Financeiro*/
		int PatrimonioBruto = ff.getSalario() + ff.getFreeLancers();
		int GastosTotal = ff.getContasEssenciais() + ff.getGastosUsuario();
		int PatrimonioLiquido = PatrimonioBruto - GastosTotal;
		/*Calculo Financeiro*/
		
		/*Calculo Planejamento*/
		/*Viajem*/
		int ViajemP = pl.getViajens() / PatrimonioLiquido + 1;
		/*Viajem*/
		
		/*Automovel*/
		int AutomovelP = pl.getAutomovel() / PatrimonioLiquido +1;
		/*Automovel*/
		
		/*Casa Propria*/
		int CasaP = pl.getCasaPropria() / PatrimonioLiquido +1;
		/*Casa Propria*/
		
		
		
		
		
		/*
		cc.depositar(1000);
	
		System.out.println(cc.verificarSaldo());
		
		Conta poupanca = new Conta(111, 222, 1000);
		poupanca.retirar(50);
		
		System.out.println(poupanca.verificarSaldo());
		System.out.println(uu.getid());
		System.out.println(uu.getPassword());
		System.out.println(pp.getAutomovel());
		System.out.println(PatrimonioBruto);
		System.out.println(PatrimonioLiquido);
		*/
		System.out.println("Seu Patrimonio Liquido ou seja o quanto sobra para voce por mes no momento e: " + PatrimonioLiquido);
		System.out.println("Para sua viajem voce precisa economizar pelo periodo de meses: " + ViajemP);
		System.out.println("Para comprar seu automovel voce precisa economizar pelo periodo de meses: " +AutomovelP);
		System.out.println("Para comprar sua Casa Propria voce precisa economizar pelo periodo de meses: " +CasaP);
	}

}
