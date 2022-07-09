package exercicios_beecrowd_java;

import java.util.Scanner;

public class ex1013 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();
		int num3 = entrada.nextInt();
		
		int maior = num1;
		
		if(num1 > num2 && num1 > num3) {
			maior = num1;
		} else if(num2 > num1 && num2 > num3) {
			maior = num2;
		} else if(num3 > num1 && num3 > num2) {
			maior = num3;
		}
		System.out.printf("%d eh o maior", maior);
		System.out.println();
		
		entrada.close();
	}
}
