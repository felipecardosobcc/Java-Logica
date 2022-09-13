package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidades.Student;

public class aluno {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student aluno;
		aluno = new Student();
		
		System.out.print("Digite o nome do aluno: ");
	    aluno.name = sc.nextLine();
	    System.out.println("Digite as notas dos três trimestres:");
	    aluno.t1 = sc.nextDouble();
	    aluno.t2 = sc.nextDouble();
	    aluno.t3 = sc.nextDouble();
	    
	    aluno.result();
	    
	    sc.close();

	}

}
