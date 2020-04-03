package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class ExercList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Employee> listEmployee = new ArrayList<Employee>();
		System.out.print("How many employees will be registered? ");
		int qtRegistered = scan.nextInt();
		for(int i = 0; i < qtRegistered; i++) {
			System.out.println("Emplyoee #"+(i+1)+":");
			System.out.print("id: ");
			int id = scan.nextInt();
			System.out.print("Name: ");
			String name = scan.next();
			System.out.print("Salary: ");
			double salary = scan.nextDouble();
			listEmployee.add(new Employee(id, name, salary));
		}
		System.out.print("Enter the employee id that will have salary increase : ");
		int employeeId = scan.nextInt();
		Employee employee = listEmployee.stream().filter(x -> x.getId() == employeeId).findFirst().orElse(null);
		if(employee != null) {
			System.out.print("Enter the percentage: ");
			double percentage = scan.nextDouble();
			employee.increaseSalary(percentage);
		}
		else{
			System.out.println("This id does not exist!");
		}
		System.out.println("List of employees:");
		for(Employee item : listEmployee) {
			System.out.println(item.toString());
		}
		
		scan.close();
	}

}
