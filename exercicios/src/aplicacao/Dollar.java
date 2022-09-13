package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidades.DollarConverter;

public class Dollar {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a cotação do dólar:");
		double cotacao = sc.nextDouble();
		System.out.println("Digite a quantidade de dólar que você irá comprar:");
		double quant = sc.nextDouble();
		
		System.out.println();
		System.out.println("Valor pago em real: " + DollarConverter.conversor(cotacao, quant));
		
		sc.close();
		
	}

}
