import java.util.ArrayList;
import java.util.List;

public class Supervisor extends Employee {
	
	
	
	private List<Employee> supervisedEmployees = new ArrayList<>();
	public Supervisor(String name) {
		super(name);
	}
	
	@Override
	public void listHierarchy(int level) {
		
		printName(level);
		supervisedEmployees.forEach(employee -> employee.listHierarchy(level + 1));
		
		
		
		
		
	}
	
	
	public List<Employee> getSupervisedEmployees() {
		return this.supervisedEmployees;
	}
	public void hireEmployee(Employee employee) {
		
		supervisedEmployees.add(employee);
	}
	
	public void fireEmployee(Employee employee) {
		
		supervisedEmployees.remove(employee);
	}
	
}