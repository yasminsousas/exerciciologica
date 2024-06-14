package estudos;

import java.util.Locale;
import java.util.Scanner;

public class Ifexercicioseis {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor qualquer: ");
		double x = sc.nextDouble();
		
		if (x < 0 || x > 100) {
			System.out.println("Fora do intervalo");
		}
		else if (x <= 25) {
			System.out.println("Entre [0,25]");
		}
		else if (x <= 50) {
			System.out.println(" Entre [25,50]");
		}
		else if (x <= 75) {
			System.out.println("Entre [50,75]");
		}
		else {
			System.out.println("Entre [75,100]");
		}
		sc.close();
	}

}
