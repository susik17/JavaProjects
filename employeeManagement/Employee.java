package employeeManagement;

public class Employee {
	private int id;
	private String name ;
	private int age ;
	private String department ;
	private double salary ;
    //setters and getters
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getDepartment() {
		return department;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	
	//constructor
	public Employee(int id,String name,int age,String department,double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.department = department;
		this.salary = salary;
	}
	@Override
	public String toString() {
		System.out.println("- - - - - - - - - - - - - - - - - - - -");
		return "|   "+ id + "|   "+ name+   "|" +age +" | " + department +  "| " +salary+" |";
	}
		
         
}
