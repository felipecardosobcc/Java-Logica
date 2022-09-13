package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidades.DataPeople;

public class dados_pessoas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número de pessoas que serão analisadas: ");
		int n = sc.nextInt();
		
		DataPeople[] pessoas = new DataPeople[n];
		double maior = 0;
		double menor = 999999999;
		double soma = 0;
		double media = 0;
		int contador_homem = 0;
		int contador_mulher = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite a altura da "+(i+1)+"° pessoa: ");
			double altura = sc.nextDouble();
			System.out.print("Informe o gênero da "+(i+1)+"° pessoa(F/M): ");
			char genero = sc.next().charAt(0);
			pessoas[i] = new DataPeople(altura, genero);
			System.out.println();
			if (pessoas[i].getGenero()=='F' || pessoas[i].getGenero()=='f') {
				soma += pessoas[i].getAltura();
				contador_mulher += 1;
			}
			else if (pessoas[i].getGenero()=='M' || pessoas[i].getGenero()=='m') {
				contador_homem += 1;
			}
			
		}
		
		for (int i = 0; i < n; i++) {
			if (pessoas[i].getAltura() < menor) {
				menor = pessoas[i].getAltura();
			}
			else if (pessoas[i].getAltura() > maior) {
				maior = pessoas[i].getAltura();
			}
		}
		
		media = soma/contador_mulher;
		
		System.out.println("Menor altura: " + String.format("%.2f", menor));
		System.out.println("Maior altura: " + String.format("%.2f", maior));
		System.out.println("Média das alturas das mulheres: " + String.format("%.2f", media));
		System.out.println("Número de homens: " + contador_homem);
		
		sc.close();

	}

}
