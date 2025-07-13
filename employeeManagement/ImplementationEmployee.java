package employeeManagement;
import java.util.HashSet;
import java.util.Scanner;

public class ImplementationEmployee implements InterfaceEmployee{
	
	Scanner scan = new Scanner(System.in);
	//Use class as type reference 
	HashSet<Employee> employeeSet = new HashSet<>();
    
	Employee emp1 = new Employee(1,"XXXX",21,"develper",60000.00);
    Employee emp2 = new Employee(2,"YYYY",22,"devops",80000.00);
    Employee emp3 = new Employee(3,"ZZZZ",25,"tester",40000.00);
    Employee emp4 = new Employee(4,"WWWW",29,"Manager",100000.00);
    
    public ImplementationEmployee() {
    	employeeSet.add(emp1);
    	employeeSet.add(emp2);
    	employeeSet.add(emp3);
    	employeeSet.add(emp4);
    	
    	
    }
    int id;
    String name;
    int age;
    String department;
    double salary;
    boolean found = false;
	@Override
	public void addEmployee() {
		System.out.println("Enter Employee id:");
		id = scan.nextInt();
		System.out.println("Enter Employee Name:");
		name = scan.next();
		System.out.println("Enter Employee age:");
		age = scan.nextInt();
		System.out.println("Enter Employee department:");
		department = scan.next();
		System.out.println("Enter Employee salary:");
		salary = scan.nextDouble(); 
		
		Employee emp = new Employee(id,name,age,department,salary);
		employeeSet.add(emp);
		System.out.println("Employee Details Added Successfully");
		
	}

	@Override
	public void viewEmployee() {
		System.out.println("Enter Employee id :");
		id = scan.nextInt();
		for(Employee emp : employeeSet) {
			if(emp.getId() == id) {
				System.out.println(emp);
				found = true;
			}
		}
		if(!found) {
			System.out.println("Employee with this id is Not found;");
		}
		
	}

	@Override
	public void deleteEmployee() {
		System.out.println("Enter Employee id to delete:");
		id = scan.nextInt();
		Employee empdelete =null;
		found = false;
		for(Employee emp : employeeSet) {
			if(emp.getId()==id) {
				empdelete = emp;
				found =  true;
			}
		}
		if(!found) {
			System.out.println("Employee with this id is not present!");
		}
		else {
			employeeSet.remove(empdelete);
			System.out.println("Employee Details with this id deleted Successfully!");
		}
		
	}

	@Override
	public void viewAllEmployees() {
		for(Employee emp : employeeSet) {
			System.out.println(emp);
			
		}
		
	}
	

}
