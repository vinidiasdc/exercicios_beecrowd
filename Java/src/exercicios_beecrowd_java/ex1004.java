package exercicios_beecrowd_java;

import java.util.Scanner;

public class ex1004 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int a = entrada.nextInt();
		int b = entrada.nextInt();
		
		int PROD = a*b;
		
		System.out.println("PROD = " + PROD);
		
		entrada.close();

	}

}
