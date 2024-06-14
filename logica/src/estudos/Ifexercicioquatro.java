package estudos;
//erro
import java.util.Locale;
import java.util.Scanner;

//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas. 
public class Ifexercicioquatro {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a hora inicial: ");
		int hInicial = sc.nextInt();
		System.out.println("Digite a hora final: ");
		int hFinal = sc.nextInt();
		
		int duracao;
		if(hFinal < hInicial) {
			duracao = hFinal - hInicial;
		}
		else {
			duracao = 24 - hFinal + hInicial;
		}
		System.out.println("Duração ="+ duracao +"Hora(s)");
		sc.close();
	}

}
