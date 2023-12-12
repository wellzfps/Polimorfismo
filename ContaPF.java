package entities;

public class ContaPF extends Conta {
	
	private final double limiteEmprestimo = 1100.50;
	private final double taxaSaque = 1.75;
	private double saque = 0.00;
	
	public double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}
	public double getTaxaSaque() {
		return taxaSaque;
	}

	public void emprestimo(double valor) {
		if (valor > getLimiteEmprestimo()) {
			System.out.println("Valor não autorizado para esse saque");
		}else {
			valor =- getLimiteEmprestimo() - getTaxaSaque();
		}
		
	}
	
	public double getSaque() {
		return saque;
	}
	
	public void setSaque(double saque) {
		this.saque = saque;
	}
	public void saque1(double valor) {
	 this.saque(valor);
	}
}
