package Questao8;

public class ContaPoupanca {

	private ContaBancaria contaBancaria;
	
	public ContaPoupanca(ContaBancaria contaBancaria) {
		this.contaBancaria = contaBancaria;
	}

	public void depositar(double valor) {
		contaBancaria.depositar(valor);
	}
	
	public void sacar(double valor) {
		contaBancaria.sacar(valor);
	}
	
	public double getSaldo(){
		return contaBancaria.getSaldo();
	}

	public int getAgencia() {
		return contaBancaria.getAgencia();
	}

	public void setAgencia(int agencia) {
		contaBancaria.setAgencia(agencia);
	}

	public int getConta() {
		return contaBancaria.getConta();
	}

	public void setConta(int conta) {
		contaBancaria.setConta(conta);;
	}

	public String getTitular() {
		return contaBancaria.getTitular();
	}

	public void setTitular(String titular) {
		contaBancaria.setTitular(titular);;;
	}
}

