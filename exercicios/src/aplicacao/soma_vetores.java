package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetores {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Forneça o TAMANHO para os dois vetores: ");
		int n = sc.nextInt();
		
		int[] vect1 = new int[n];
		int[] vect2 = new int[n];
		
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número para o primeiro vetor: ");
			vect1[i] = sc.nextInt();
		}
		
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número para o segundo vetor: ");
			vect2[i] = sc.nextInt();
		}
		
		int[] vect_soma = new int[n];
		for (int i = 0; i < n; i++) {
			vect_soma[i] = vect1[i] + vect2[i];
		}
		
		System.out.println();
		System.out.println("VETOR RESULTANTE:");
		for (int i = 0; i < n; i++) {
			System.out.println(vect_soma[i]);
		}
		
		sc.close();
		
	}

}
