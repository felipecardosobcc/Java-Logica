package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class mais_velho {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número de pessoas: ");
		int n = sc.nextInt();
		int maior_idade = 0;
		String maior_nome = null;
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.print("Digite o nome da " + (i+1)+ "° pessoa: ");
			nome[i] = sc.nextLine();
			System.out.print("Digite a idade da " + (i+1)+ "° pessoa: ");
			idade[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			if (idade[i]>maior_idade) {
				maior_idade = idade[i];
			    maior_nome = nome[i];
			}
		}
		
		System.out.println();
		System.out.println("PESSOA MAIS VELHA: " + maior_nome);
		
		
		
		sc.close();
		
	}

}
