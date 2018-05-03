
public class Funcionario {

	private String nome;
	private Strategy cargo;
	private double comissao;

	public Funcionario(String nome, Strategy cargo) {
		this.nome = nome;
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Strategy getCargo() {
		return cargo;
	}

	public void setCargo(Strategy cargo) {
		this.cargo = cargo;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
}
