package employee.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import employee.entities.Employee;
import employee.service.SalarySum;

public class Program {

	public static void main(String[] args) {
			
		List<Employee> list = new ArrayList<>();
		
		String path = "C:\\Projetos\\employee.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(";");
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}

			List<String> emails = list.stream()
					.map(e -> e.getEmail())
					.sorted()
					.collect(Collectors.toList());
			
			emails.forEach(System.out::println);
			
			SalarySum ss = new SalarySum();
			
			double sum = ss.salarySum(list, e -> e.getName().charAt(0) == 'M');
			System.out.println("Total Salary = " + sum);
			
		} catch (IOException ex) {
			System.out.printf("Erro: %s", ex.getMessage());
		}
			
	}
	
}
