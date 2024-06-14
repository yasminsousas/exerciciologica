package estudos;

import java.util.Locale;
import java.util.Scanner;

// Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e 
//mostre:  
//a) a área do triângulo retângulo que tem A por base e C por altura.  
//b) a área do círculo de raio C. (pi = 3.14159)  
//c) a área do trapézio que tem A e B por bases e C por altura.  
//d) a área do quadrado que tem lado B.  
//e) a área do retângulo que tem lados A e B. 

public class Exercicioseis {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		double areaTri = A * C / 2.0;
		double areaRaio = C * C *  3.14159;
		double areaTra = (A + B) / 2.0 * C;
		double areaQua = B * B;
		double areaRet = A * B;
		
		System.out.printf("Triângulo: %.3f%n", areaTri);
		System.out.printf("Círculo: %.3f%n", areaRaio);
		System.out.printf("Trapézio: %.3f%n", areaTra);
		System.out.printf("Quadrado: %.3f%n", areaQua);
		System.out.printf("Retângulo: %.3f%n", areaRet);
		
		sc.close();
	}

}
