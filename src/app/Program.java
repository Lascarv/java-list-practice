package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import ui.View;

public class Program {
	
	public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		View view = new View();
		
		int menu;
		boolean rodando = true;
		
		System.out.println("Bem vindo ao SysCad!");
		while (rodando) {
			
			System.out.println(view);
			
			switch (menu = sc.nextInt()) {
			
			case 0:
				System.out.println("Encerrando o programa...");
				rodando = false;
				break;
			
			case 1: 
				
			//cadastro de funcionário	
				
				System.out.print("Quantos funcionários você deseja registrar? ");
				int n = sc.nextInt();
				
				System.out.println();
				
				for (int i = 0; i < n; i++) {
					System.out.println("Funcionário #" + (i+1));
					
					System.out.print("Id: ");
					int id = sc.nextInt();
					sc.nextLine();
					
					System.out.print("Nome: ");
					String name = sc.nextLine();
					
					System.out.print("Salário: ");
					Double salary = sc.nextDouble();
					sc.nextLine();
					System.out.println();
					
					
					Employee info = new Employee(id, name, salary);
					list.add(info);
				}
				break;
				
			case 2:
				System.out.println();
				System.out.println("Funcionários registrados: ");
				
				for ( Employee i : list ) {
					 System.out.printf("Id: %d | Nome: %s |",
			                    i.getId(), i.getName());
				}
				break;
					
			case 4:
			// ajustar o salário
				System.out.println("em andamento");
				break;
			
			}
						
				
		}
		
		System.out.println("Loop encerrado.");
		sc.close();
	}

}
