package employeeManagement;
import java.util.*;
public class Main {
	static public void menu() {
		System.out.println("********WELCOME TO EMPLOYEE MANAGEMENT SYSTEM********\n"
				+ "1.Add Employee\n"
				+ "2.view Employee\n"
				+ "3.Delete Employee\n"
				+ "4.View All Employees\n"
				+ "5.Exit");
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ImplementationEmployee iemp = new ImplementationEmployee();
		do {
			menu();
			System.out.println("Enter your choice:");
			int choice = scan.nextInt();
			switch(choice) {
			     case 1:
			    	 System.out.println("Add new Employee...!");
			    	 iemp.addEmployee();
			    	 break;
			     case 2:
			    	 System.out.println("View Employee details using Employee id...!");
			    	 iemp.viewEmployee();
			    	 break;
			     case 3:
			    	 System.out.println("Delete Employee details of given Employee id...!");
			    	 iemp.deleteEmployee();
			    	 break;
			     case 4:
			    	 System.out.println("View All Employee Details...!");
			    	 System.out.println("- - - - - - - - - - - - - - - - - - ");
			    	 System.out.println("| Id  | Name | age | dep | salary |");
			    	 iemp.viewAllEmployees();
			    	 break;
			     case 5:
			    	 System.out.println("****Thank you for using this Application****");
			    	 System.exit(0);
			    default:
			    	System.out.println("Please Enter valid choice!");  	 
			    	 
			}
			
		}
		while(true);	
		
	}
	
	}


