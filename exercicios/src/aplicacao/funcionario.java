package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidades.Employee;

public class funcionario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee funcionario;
		funcionario = new Employee();
		double porcent;
		
		System.out.print("Digite seu nome: ");
		funcionario.nome = sc.nextLine();
		System.out.print("Digite seu salário bruto: ");
		funcionario.salariobruto = sc.nextDouble();
		System.out.print("Informe o valor do imposto: ");
		funcionario.imposto = sc.nextDouble();
		
		System.out.println("Funcionário: " + funcionario.nome + ", " + funcionario.NetSalary());
		
		System.out.print("Informe a porcentagem que será incrementada: ");
		porcent = sc.nextDouble();
		
		System.out.print("Update data: " + funcionario.nome + ", ");
		funcionario.updateSalary(porcent);
		
		sc.close();

	}

}
