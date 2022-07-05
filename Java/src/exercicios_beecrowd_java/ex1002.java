package exercicios_beecrowd_java;

import java.util.Locale;
import java.util.Scanner;

public class ex1002 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		final double n = 3.14159;
		double raio = entrada.nextDouble();
		double area = n * (raio*raio);
		
		System.out.printf("A=%.4f", area);
		System.out.println();
		
		entrada.close();
	}
}
