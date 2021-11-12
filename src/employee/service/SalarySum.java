package employee.service;

import java.util.List;
import java.util.function.Predicate;

import employee.entities.Employee;

public class SalarySum {

	public double salarySum(List<Employee> list, Predicate<Employee> criteria) {
		double sum = 0.0;
		
		for (Employee e : list) {
			if (criteria.test(e)) {
				sum += e.getSalary();
			}
		}
		return sum;
	}
	
}
 