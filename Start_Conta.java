package Aplication;

import java.util.Scanner;

import Entities.ExecAPP;

public class Start_Conta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ExecAPP conta = new ExecAPP();
		
		conta.execAPP(sc);
		
		
		sc.close();

	}

}
