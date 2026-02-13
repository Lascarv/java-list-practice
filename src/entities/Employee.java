package entities;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private int id;
	private String name;
	private Double salary;
	Double percentage;
	
	public Employee (int id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;		
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public Double getSalary() {
		return salary;
	}
	
	public void setId ( int id ) {
		this.id = id;
	}
	
	public void setName ( String name ) {
		this.name = name;
	}
	
	public void setSalary ( Double salary ) {
		this.salary = salary;
	}
	
	public void increaseSalary(Double percentage) {
		salary += salary * (percentage / 100.0);
	}
	
	public void updateSalary (Double newSalary) {
		salary = newSalary;
	}
	
	@Override
	public String toString() {
		return "Id:" + id + "Nome: " + name + "Salário: " + salary;		
	}
}
