package Questão6;

public class ContaBancaria {
	
	private double saldo;
	private String titular;
	private int agencia;
	private int conta;
	
	public ContaBancaria(String titular, int agencia, int conta){		
		this.titular = titular;
		this.agencia = agencia;
		this.conta = conta;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void sacar(double valor) {
		if(saldo >= valor) {
			saldo -= valor;
		} else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
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
	
	
}
