package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import entidades.Funcionario;

public class funcionario_list {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número de funcionários: ");
		int n = sc.nextInt();
		
		String name;
		int id;
		double salary;
		
		List<Funcionario> list = new ArrayList<>();
		
		System.out.println();
		for (int i=0; i<n; i++) {
			System.out.println("Employee #" + (1+i) + ":");
			System.out.print("Id: ");
			id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			sc.nextLine();
			System.out.print("Name: ");
			name = sc.nextLine();
			System.out.print("Salary: ");
            salary = sc.nextDouble();
            list.add(new Funcionario(id, name, salary));
            System.out.println();
		}
		
		System.out.print("Entre com a Id do funcionário que terá o salário incrementado: ");
		int Id = sc.nextInt();
		Funcionario emp = list.stream().filter(x -> x.getId() == Id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (Funcionario obj : list) {
			System.out.println(obj);
		}
		
		sc.close();

	}
	
	public static boolean hasId(List<Funcionario> list, int id) {
		Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
