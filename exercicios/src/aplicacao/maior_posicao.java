package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class maior_posicao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do vetor: ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		double maior = 0;
		int indice = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			if (vect[i] > maior) {
				maior = vect[i];
				indice = i;
			}
		}
		
		System.out.println();
		System.out.println("MAIOR VALOR = " + maior);
		System.out.println("POSIÇÃO = " + indice);
		
		sc.close();		

	}

}
