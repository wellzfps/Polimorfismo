package entities;

public class ContaPF extends Conta {
	
	private final double limiteEmprestimo = 1100.50;
	private final double taxaSaque = 1.75;
	
	public double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}
	public double getTaxaSaque() {
		return taxaSaque;
	}

	public void emprestimo(double valor) {
		valor =- getLimiteEmprestimo() - getTaxaSaque();
	}
}
