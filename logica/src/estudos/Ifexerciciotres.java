package estudos;

import java.util.Locale;
import java.util.Scanner;

//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao 
//Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em 
//ordem crescente ou decrescente. 
public class Ifexerciciotres {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		int A = sc.nextInt();
		System.out.println("Digite o valor de B: ");
		int B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {// || ou
			System.out.println("Múltiplos");
		}
		else {
			System.out.println("Não múltiplos");
		}
		sc.close();
	}
	
}
