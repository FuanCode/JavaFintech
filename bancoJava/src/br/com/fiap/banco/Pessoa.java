package br.com.fiap.banco;

public class Pessoa extends Usuario{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String email;
	private int senha;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}


}
