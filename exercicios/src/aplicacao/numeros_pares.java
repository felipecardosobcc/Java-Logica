package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class numeros_pares {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do vetor: ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		int soma = 0;
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
			if ((vect[i]%2)==0) {
				soma += 1;
			}	
		}
		
		System.out.println();
		System.out.println("NÚMEROS PARES:");
		for (int i=0;i<n;i++) {
			if ((vect[i]%2)==0) {
				System.out.print(vect[i] + " ");
			}
		}
		System.out.println();
		System.out.print("QUANTIDADE DE NÚMEROS PARES: " + soma);
		
		sc.close();

	}

}
