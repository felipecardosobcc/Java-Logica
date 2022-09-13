package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidades.Height;

public class alturas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas? ");
		int n = sc.nextInt();
		
		Height[] peopleData = new Height[n];
		String[] nomes = new String[n];
		double soma = 0;
		double media;
		int menor16 = 0;
		
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			peopleData[i] = new Height(nome, idade, altura);
			soma += peopleData[i].getAltura();
			if (peopleData[i].getIdade() < 16) {
				menor16 += 1;
				nomes[i] = peopleData[i].getNome();
			}
		}
		
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + i+1 + "a pessoa:");
			System.out.println("Nome: " + peopleData[i].getNome());
			System.out.println("Idade: " + peopleData[i].getIdade());
			System.out.println("Altura: " + peopleData[i].getAltura());
			System.out.println();
		}
		
		media = soma/n;
		System.out.println("Altura média: " + String.format("%.2f", media));
		double porcentmenor16 = menor16*100/n;
		System.out.println("Pessoas com menos de 16 anos: " + String.format("%.1f", porcentmenor16) + "%");
		for (int i = 0; i < n; i++) {
			if (nomes[i]!=null) {
				System.out.println(nomes[i]);
			}
		}
		
		sc.close();

	}

}
