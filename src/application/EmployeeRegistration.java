package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class EmployeeRegistration {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Employee Registration");
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		System.out.println(" ");
		
		List<Employee> list = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			while(sameId(list, id)) {
				System.out.print("Existing ID. Try again: ");
				id = sc.nextInt();
			}
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Employee(id, name, salary));
			System.out.println(" ");
		}
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
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
		for (Employee user : list) {
			System.out.println(user);
		}
		sc.close();
	}
	public static boolean sameId(List<Employee> list, int id) {
		Employee result = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return result != null;
	}
}
