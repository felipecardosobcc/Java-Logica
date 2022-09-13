package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do vetor: ");
        int n = sc.nextInt();
        
        double[] vect = new double[n];
        double soma = 0;
        double media;
        
        for (int i = 0; i < n; i++) {
        	System.out.print("Digite um número: ");
        	vect[i] = sc.nextDouble();
        }
        
        System.out.println();
        System.out.print("VALORES: ");
        for (int i = 0; i < n; i++) {
        	System.out.print(String.format("%.2f", vect[i]) + " ");
        	soma += vect[i];
        }
        media = soma/n;
        System.out.println();
        System.out.println("SOMA: " + String.format("%.2f", soma));
        System.out.print("MÉDIA: " + String.format("%.2f", media));
        
        sc.close();
  
	}

}
