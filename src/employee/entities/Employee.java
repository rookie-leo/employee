package employee.entities;

public class Employee {

	private String name;
	private String email;
	private Double salary;
	
	public Employee () {
	}
	
	public Employee(String name, String email, Double salary) {
		super();
		this.name = name;
		this.email = email;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public Double getSalary() {
		return salary;
	}
	
	
	
}
