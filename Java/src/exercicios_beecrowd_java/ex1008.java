package exercicios_beecrowd_java;

import java.util.Scanner;

public class ex1008 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
			
		int numFuncionario = entrada.nextInt();
		int horasTrabalhadas = entrada.nextInt();
		float valorHora = entrada.nextFloat();
		
		float salario = valorHora * horasTrabalhadas;
		System.out.println("NUMBER = " + numFuncionario);
		System.out.printf("SALARY = U$ %.2f", salario);
		System.out.println();
		
		entrada.close();
	}
}
