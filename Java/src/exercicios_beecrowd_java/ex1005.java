package exercicios_beecrowd_java;

import java.util.Scanner;

public class ex1005 {
	public static void main(String[] args) {
		Scanner entrada =  new Scanner(System.in);
		
		float A = entrada.nextFloat();
		float B = entrada.nextFloat();
		
		double media = ((A*3.5) + (B*7.5)) / (3.5 + 7.5);
		
		System.out.printf("Média = %.5f", media);
		System.out.println();
		
		entrada.close();
	}
}
