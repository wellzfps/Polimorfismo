package Entities;

public class Conta {
	private int numero;
	private String titular;
	private double saldo;
	private String tipoDaConta;
	
	
	

	public String getTipoDaConta() {
		return tipoDaConta;
	}
	public void setTipoDaConta(String tipoDaConta) {
		this.tipoDaConta = tipoDaConta;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	// Métodos
	
	public void saque (double sacar) {
		double tempSaldo = sacar;
		setSaldo(getSaldo() - tempSaldo);
	}
	
	public void deposito (double depositar) {
		this.saldo += depositar;
	}
	
	
	
	
	
	
	
	
}