package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidades.Triangle;

public class areatriangle {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x,y;
		x = new Triangle();
		y = new Triangle();
		
		String maior;
		
		System.out.println("Digite os valores dos lados do Triângulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Digite os valores dos lados do Triângulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double ax = x.area();
		double ay = y.area();
		
		System.out.println();
		System.out.println("Área X: " + ax);
        System.out.print("Área Y: " + ay);
        
        if (ax > ay) {
        	maior = String.format("%.4f", ax);
        }
        else if(ay > ax) {
        	maior = String.format("%.4f", ay);
        }
        else {
        	maior = "ÁREAS IGUAIS";
        }
        
        System.out.println();
        System.out.print("Maior área: " + maior);
		
		sc.close();

	}

}
