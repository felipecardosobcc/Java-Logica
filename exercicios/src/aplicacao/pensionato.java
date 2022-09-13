package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidades.Aluguel;

public class pensionato {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluguel[] quarto = new Aluguel[10];
		
		System.out.println("Quantos quartos serão alugados?");
		int n = sc.nextInt();
		System.out.println();
		String nome, email;
		int room;
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Rent #" + (i+1));
			System.out.print("Name: ");
			nome = sc.nextLine();
			System.out.print("E-mail: ");
			email = sc.nextLine();
			System.out.print("Room(0-9): ");
			room = sc.nextInt();
			quarto[room] = new Aluguel(nome, email);
			System.out.println();
		}
		
		System.out.println("Busy rooms:");
		for (int i=0; i<10; i++) {
			if (quarto[i] != null) {
				System.out.print(i + ": " + quarto[i].getNome() + ", " + quarto[i].getEmail());
				System.out.println();
			}
		}
		
		sc.close();

	}

}
