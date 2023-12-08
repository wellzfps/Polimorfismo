package entities;

public class ContaPoupança extends Conta {

	private final double taxaRendimento = 1.5;
	
	public double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void atualizarSaldo() {
	
		setSaldo(getSaldo()*getTaxaRendimento());
	}
		
}
