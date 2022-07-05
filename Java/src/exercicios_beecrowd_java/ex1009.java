package exercicios_beecrowd_java;

import java.util.Scanner;

public class ex1009 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		// String nome = entrada.next();
		float salario = entrada.nextFloat();
		double totalVendas = entrada.nextDouble();
		
		double comissao = salario + (totalVendas * (15.0/100.0));
		
		System.out.printf("TOTAL = R$ %.2f", comissao);
		
		entrada.close();
	}
}
