package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class aprovados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serão analisados? ");
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		double[] nota1 = new double[n];
		double[] nota2 = new double[n];
		double[] media = new double[n];
		
		System.out.println();
		for (int i=0; i<n; i++) {
			sc.nextLine();
			System.out.println("DADOS DO "+(i+1)+"° ALUNO:");
			System.out.print("Nome: ");
			nome[i] = sc.nextLine();
			System.out.print("Primeira nota: ");
			nota1[i] = sc.nextDouble();
			System.out.print("Segunda nota: ");
			nota2[i] = sc.nextDouble();
			media[i] = (nota1[i] + nota2[i])/2;
			System.out.println();
		}
		
		System.out.println("ALUNOS APROVADOS:");
		for (int i = 0; i < n; i++) {
			if (media[i] >= 6.0) {
				System.out.println(nome[i]);
			}
		}
		
		sc.close();

	}

}
