package br.cesed.si;

public class Main {
	
	public static void main(String[] args) {
		
		Pai pai = new Pai();
		pai.setNome("Pai");
		pai.setIdade(50);
		
		Filho filho = new Filho();
		filho.setNome("Filho");
		filho.setIdade(20);
		filho.setPai(pai);
		filho.setEmail("filho@email.com");
		
		System.out.println(pai.dados());
		System.out.println(filho.dados());
	}

}
