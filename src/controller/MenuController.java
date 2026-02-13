package controller;

import java.util.List;

import entities.Employee;
import services.EmployeeService;

public class MenuController {
	
	private EmployeeService service = new EmployeeService();
	
	public void addEmployee(int id, String name, double salary) {
	
		Employee emp = new Employee(id, name, salary);
		service.addEmployee(emp);
		
	}
	
	public List<Employee> listEmployees() {
		return service.getAllEmployees();
	}
	
	public boolean updateSalary(int id, double newSalary) {
		
		return service.updateEmployeeSalary(id, newSalary);
	}
	
	public boolean increaseSalary(int id, double salary) {
		return service.increaseEmployeeSalary(id, salary);
	}
	
	public boolean removeEmployee (int id) {
		return service.removeEmployee(id);
	}
	

}
