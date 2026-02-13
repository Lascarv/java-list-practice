package services;

import java.util.ArrayList;
import java.util.List;

import entities.Employee;

public class EmployeeService {

	List<Employee> list = new ArrayList<>();

	public void addEmployee(Employee e) {
		list.add(e);
	}

	public Employee findById(int id) {
		for (Employee e : list) {
			if (e.getId() == id) {
				return e;
			}
		}
		return null;
	}

	public List<Employee> getAllEmployees() {
		return list;
	}

	public boolean updateEmployeeSalary(int id, Double newSalary) {

		Employee emp = findById(id);

		if (emp == null) {
			return false;
		}

		emp.updateSalary(newSalary);
		return true;
	}

	public boolean increaseEmployeeSalary(int id, Double percentage) {

		Employee emp = findById(id);

		if (emp == null) {
			return false;
		}

		emp.increaseSalary(percentage);
		return true;
	}
	
	public boolean removeEmployee(int id) {
		
		Employee emp = findById(id);
		
		if (emp == null) {
			return false;
		}
		
		list.remove(emp);
			return true;
		}

}
