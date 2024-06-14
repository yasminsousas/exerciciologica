package estudos;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não. 
public class Ifexercicioum {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		int x = sc.nextInt();
		
		if (x > 0) {
			System.out.println("Não negativo");	
		}
		else{
			System.out.println("Negativo");
		}
		sc.close();
	}
		
}
