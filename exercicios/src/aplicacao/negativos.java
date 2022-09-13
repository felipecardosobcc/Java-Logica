package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class negativos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do vetor: ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		int contador = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();		
		}
		
		System.out.println("Números negativos do vetor: ");
		
		for (int i = 0; i < n; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
				contador += 1;
			}
		}
		
		if (contador == 0) {
			System.out.print("Nenhum número negativo encontrado.");
		}
		
		sc.close();

	}

}
