package exercicios_beecrowd_java;

import java.util.Scanner;

public class ex1011 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
				
		float raio = entrada.nextFloat();
		final double pi = 3.14159;
		
		double volumeEsfera = (4/3.0) * pi * Math.pow(raio,3);
		
		System.out.printf("VOLUME = %.3f", volumeEsfera);
		
		entrada.close();
	}
}
