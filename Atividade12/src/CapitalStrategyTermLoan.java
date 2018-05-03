
public class CapitalStrategyTermLoan extends CapitalStrategy {

	@Override
	public double capital(Loan loan) {
		return loan.getCommitment() * duration(loan) * riskFactorFor(loan);
		
	}
	
	@Override
	public double duration(Loan loan) {
		return 0;
	}

}
