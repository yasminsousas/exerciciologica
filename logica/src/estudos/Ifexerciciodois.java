package estudos;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar. 
public class Ifexerciciodois {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		int x = sc.nextInt();
		
		if (x % 2 == 0) {
			System.out.println("Par");
		}
		else{ 
			System.out.println("Ímpar");
		}
		sc.close();
	}

}
