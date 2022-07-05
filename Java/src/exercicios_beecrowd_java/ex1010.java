package exercicios_beecrowd_java;

import java.util.Scanner;

public class ex1010 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		// int codPeca1 = entrada.nextInt();
		int numPeca1 = entrada.nextInt();
		float valorUnitario1 = entrada.nextFloat();
		
		// int codPeca2 = entrada.nextInt();
		int numPeca2 = entrada.nextInt();
		float valorUnitario2 = entrada.nextFloat();
		
		
		double valorPagar = (numPeca1 * valorUnitario1) + (numPeca2 * valorUnitario2);
		
		System.out.printf("VALOR A PAGAR : R$ %.2f", valorPagar);
		System.out.println();
		
		entrada.close();
	}
}
