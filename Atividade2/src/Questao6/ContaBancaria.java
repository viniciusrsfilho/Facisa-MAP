package Questao6;

import java.util.Date;

public class ContaBancaria {

	private int agencia;
	private int conta;
	private Pessoa titular;
	private double saldo;
	
	public ContaBancaria(int agencia, int conta, Pessoa titular) {
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
	
	public double getSaldo() {
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

	public Pessoa getTitular() {
		return titular;
	}

	public String getNomeTitular() {
		return titular.getNome();
	}

	public void setNomeTitular(String nome) {
		titular.setNome(nome);
	}

	public String getCpfTitular() {
		return titular.getCpf();
	}

	public void setCpfTitular(String cpf) {
		titular.setCpf(cpf);
	}

	public Date getDataDeNascimentoTitular() {
		return titular.getDataDeNascimento();
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		titular.setDataDeNascimento(dataDeNascimento);
	}
}
