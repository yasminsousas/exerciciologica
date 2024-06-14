package estudos;
//imposto de renda
//necessário o .0 para não dar erro
import java.util.Locale;
import java.util.Scanner;

public class Ifexerciciooito {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu salário: ");
		double salary = sc.nextDouble();
		double impostoRenda;
		
		if(salary <= 2000.0) {
			impostoRenda = 0.0;
		}
		else if (salary <= 3000.0) {
			impostoRenda = (salary - 2.000) * 0.08;
		}
		else if (salary <= 4500.0) {
			impostoRenda = (salary - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			impostoRenda = (salary - 4500.0)* 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		if (impostoRenda == 0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("Valor: R$ %.2f%n", impostoRenda);
		}
		sc.close();
	}

}
