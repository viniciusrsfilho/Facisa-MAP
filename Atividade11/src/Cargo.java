
public enum Cargo implements Strategy {
	
	ATENDENTE {
		@Override
		public double calcularComissao(double valorVenda) {
			return (valorVenda * 0.01);
		}
		
	},
	VENDEDOR {
		@Override
		public double calcularComissao(double valorVenda) {
			return (valorVenda * 0.02);
		}
		
	},
	GERENTE {
		@Override
		public double calcularComissao(double valorVenda) {
			return (valorVenda * 0.03);
		}
	}
}
