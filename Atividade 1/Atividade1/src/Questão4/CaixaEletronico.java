package Questão4;

public class CaixaEletronico {
	
	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria("123.123.456-78");
		conta.depositar(100.0);
		System.out.println(conta.getSaldo());
	}
}
