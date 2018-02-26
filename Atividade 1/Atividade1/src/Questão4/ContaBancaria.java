package Questão4;

public class ContaBancaria {

	private double saldo;
	private String cpfDoTitular;
	private int agencia;
	private int conta;
	
	public ContaBancaria(String cpfDoTitular){		
		this.cpfDoTitular = cpfDoTitular;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public double getSaldo() {
		return saldo;
	}
}
