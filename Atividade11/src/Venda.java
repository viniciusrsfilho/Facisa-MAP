
public class Venda {
	
	private double valorVenda;
    private Funcionario funcionario;
    
	public Venda(double valorVenda, Funcionario funcionario) {
		this.valorVenda = valorVenda;
		this.funcionario = funcionario;
	}
	
    public void save() {
        final double valorComissao = this.funcionario.getCargo().calcularComissao(this.valorVenda);
    }
    
}
