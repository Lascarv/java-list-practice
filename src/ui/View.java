package ui;

import java.util.List;
import java.util.Scanner;

import controller.MenuController;
import entities.Employee;

public class View {
	
	//formatar sysout
	//adicionar o metodo increaseSalary

	MenuController controller = new MenuController();
	Scanner sc = new Scanner(System.in);

	public void start() {

		int option;

		do {
			System.out.println(
					"Bem vindo ao SysCad!\n" + "-----------------------------------------------------------\n\n"
							+ "Digite os números a seguir de acordo com sua escolha: \n\n"
							+ "0 - Encerrar o programa \n" + "1 - Cadastrar funcionário \n" + "2 - Ver funcionários \n"
							+ "3 - Ajustar salário \n" + "4 - Remover funcionário \n");

			option = sc.nextInt();

			switch (option) {
			case 1:
				addEmployee();
				break;
			case 2:
				listEmployee();
				break;
			case 3:
				changeSalary();
				break;
			case 4:
				removeEmployee();
				break;
			}

		} while (option != 0);
	}

	private void addEmployee() {

		System.out.println("id: ");
		int id = sc.nextInt();
		sc.nextLine();

		System.out.println("Nome: ");
		String name = sc.nextLine();

		System.out.println("Salário: ");
		double salary = sc.nextDouble();

		controller.addEmployee(id, name, salary);

		System.out.println("Funcionário cadastrado!");
	}

	private void listEmployee() {

		List<Employee> list = controller.listEmployees();

		for (Employee e : list) {
			System.out.println(e);
		}
	}

	private void changeSalary() {
		
		System.out.println("Digite o ID");
		int id = sc.nextInt();
		
		boolean update = true;
		
		if (update) {
			System.out.println("Digite o novo salário: ");
			double newSalary = sc.nextDouble();
			controller.updateSalary(id, newSalary);
		} else {
			System.out.println("Funcionário não encontrado.");
		}
	}
	
	private void removeEmployee() {
		System.out.println("Digite o ID para remover: ");
		int id = sc.nextInt();
		
		boolean removed = controller.removeEmployee(id);
		
		if (removed) {
			System.out.println("Funcionário removido!");
		} else {
			System.out.println("Funcionário não encontrado");
		}
	
	}
}
