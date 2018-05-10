package br.cesed.si;

public class Filho implements Familia {

	private Pai pai;
	private String nome;
	private int idade;
	private String email;
	
	@Override
	public String dados() {
		return "Pai: " + pai.dados() + "\nNome: " + nome + "\nIdade: " + idade + "\nEmail: " + email;
	}

	public Pai getPai() {
		return pai;
	}

	public void setPai(Pai pai) {
		this.pai = pai;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
