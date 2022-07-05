package exercicios_beecrowd_java;

import java.util.Scanner;

public class ex1006 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float a = entrada.nextFloat();
		float b = entrada.nextFloat();
		float c = entrada.nextFloat();
		
		double media = ((a*2.00) + (b*3.00) + (c*5.00)) / (2.00 + 3.00 + 5.00);
		
		System.out.printf("MEDIA = %.1f", media);
		System.out.println();
	
		entrada.close();
	}

}
