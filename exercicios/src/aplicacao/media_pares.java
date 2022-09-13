package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class media_pares {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Forneça o tamanho do vetor: ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		int soma = 0;
		int contador = 0;
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		
		for (int i=0; i<n; i++) {
			if (vect[i]%2 == 0) {
				soma += vect[i];
				contador += 1;
			}
		}
		
		System.out.println();
		if (contador !=0) {
			double media = soma/contador;
			System.out.println("MEDIA DOS PARES = " + media);
		}
		else {
			System.out.println("NENHUM NUMERO PAR ENCONTRADO.");
		}
		
		sc.close();

	}

}
