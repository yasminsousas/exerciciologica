package estudos;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
//decimais.

public class Exercicioquatro {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US); //em cima do scanner para leitura
		Scanner sc = new Scanner(System.in);
		
		int numberFun = sc.nextInt();
		int numberHoras = sc.nextInt();
		double valorHoras = sc.nextDouble();
		double salary = numberHoras * valorHoras;
		
		System.out.println("Number = " + numberFun);
		System.out.printf("Salary = U$ %.2f%n", salary);
		
		sc.close();
	}
}
