package program;

import java.util.Locale;
import java.util.Scanner;

import employee.Employee;

public class Salary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		Employee employee = new Employee();
		
		System.out.print("Nome: ");
		
		employee.name = sc.nextLine();
		
		System.out.print("Salario bruto: ");
		
		employee.gross_salary = sc.nextDouble();
		
		System.out.print("Imposto %: ");
		
		employee.tax_percentage = sc.nextDouble();
		
		System.out.println();
		System.out.println("Funcionario: " + employee);
		
		System.out.println();
		System.out.print("Aumento de salario %: ");
		
		int increase = sc.nextInt();
		employee.increase(increase);
		
		System.out.print("Funcionario atualizado: " + employee.increase_result());
		
		sc.close();

	}

}
