package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidades.Product;

public class produto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product produto;
		produto = new Product();
		
		System.out.println("Entre com os dados do produto:");
		System.out.print("Nome: ");
		produto.nome = sc.nextLine();
		System.out.print("Preço: ");
		produto.preco = sc.nextDouble();
		System.out.print("Quantidade no estoque: ");
		produto.quant = sc.nextInt();
		
		System.out.println();
		produto.estoque();
		
		System.out.println();
		produto.add(5);
		
		System.out.println();
		produto.rm(3);
		
		
		sc.close();

	}

}
