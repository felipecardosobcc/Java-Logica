package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Abaixo_da_media {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o tamanho do vetor? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		double[] vectLower = new double[n];
		double soma = 0;
		double media;
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		
		for (int i=0; i<n; i++) {
			soma += vect[i];
		}
		
		media = soma/n;
		for (int i=0; i<n; i++) {
			if (vect[i] < media) {
				vectLower[i] = vect[i];
			}
		}
		
		System.out.println();
		System.out.println("MÉDIA DO VETOR = " + String.format("%.3f", media));
		System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");
		for (int i=0; i<n; i++) {
			if (vectLower[i] != 0) {
				System.out.println(vectLower[i]);
			}
		}
		
		
		sc.close();
		
	}

}
