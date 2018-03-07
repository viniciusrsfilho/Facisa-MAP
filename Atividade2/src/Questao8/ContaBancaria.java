package Questao8;

public class ContaBancaria {
	
	private int agencia;
	private int conta;
	private String titular;
	private double saldo;

	public ContaBancaria(int agencia, int conta, String titular) {	
		this.agencia = agencia;
		this.conta = conta;
		this.titular = titular;
	}

	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void sacar(double valor) {
		if(valor > saldo) {
			System.out.println("Saldo insuficiente");
		}
		saldo -= valor;
	}
	
	public double getSaldo(){
		return saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
}

