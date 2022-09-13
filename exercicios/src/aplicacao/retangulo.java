package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Rectangle;

public class retangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle retangulo;
		retangulo = new Rectangle();
		
		System.out.print("Digite a altura do Retângulo: ");
		retangulo.altura = sc.nextDouble();
		System.out.print("Digite a largura do Retângulo: ");;
		retangulo.largura = sc.nextDouble();
		
		System.out.println("Área: " + retangulo.area());
		System.out.println("Perímetro: " + retangulo.perimetro());
		System.out.println("Diagonal: " + retangulo.diagonal());
		
		sc.close();

	}

}
