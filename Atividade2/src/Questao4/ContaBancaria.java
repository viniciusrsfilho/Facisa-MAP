package Questao4;

public class ContaBancaria {
	
	private String cpfDoTitular;
	private double saldo;

	public ContaBancaria(String cpfDoTitular) {
		this.cpfDoTitular = cpfDoTitular;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public double getSaldo(){
		return saldo;
	}
}
