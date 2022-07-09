package exercicios_beecrowd_java;

import java.util.Scanner;

public class ex1012 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double A = entrada.nextDouble();
		double B = entrada.nextDouble();
		double C = entrada.nextDouble();
		
		final double pi = 3.14159;
		double area_tri_retangulo = (A * C) / 2;
		double areaCirculo = pi * Math.pow(C, 2);
		double area_trapezio = ((A + B) * C) / 2;
		double areaQuad = Math.pow(B, 2);
		double areaRetangulo = A*B;
		
		System.out.printf("TRIANGULO: %.3f", area_tri_retangulo);
		System.out.println();
		System.out.printf("CIRCULO: %.3f", areaCirculo);
		System.out.println();
		System.out.printf("TRAPEZIO: %.3f", area_trapezio);
		System.out.println();
		System.out.printf("QUADRADO: %.3f", areaQuad);
		System.out.println();
		System.out.printf("RETANGULO: %.3f", areaRetangulo);
		System.out.println();
		
		entrada.close();
	}
}
