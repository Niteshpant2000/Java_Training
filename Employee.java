import java.util.Scanner;
class Emp{
	 private String name;
	 private int age;
	 private float salary;
	 private String designation;

	Emp(){
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter your name: ");
		this.name=sc.nextLine();
		System.out.print("Enter your age: ");
		this.age=sc.nextInt();
		
	}

	public void raiseSalary(){
		salary+=2000;
	}
	public void setSalary(int x){
		salary+=x;
		
	}
	public int getSalary(){
		return salary;	
	}
	public void setDesignation(String desig){
		designation=desig;
	}
	public void display(){
		System.out.println("Name : "+name);
		System.out.println("Age  : "+age);
		System.out.println("Salary : "+salary);
		System.out.println("Designation : "+designation+"\n");
	}
}
class Clerk extends Emp{
	Clerk(){
		super.setSalary(10000);	
		super.setDesignation("Clerk");
	}
	
}
class Programmer extends Emp{
	Programmer(){
		super.setSalary(25000);
		super.setDesignation("Programmer");
	}
	public void raiseSalary(){
		super.salary+=5000;
	}
}
class Manager extends Emp{
	Manager(){
		super.setSalary(80000);
		super.setDesignation("Manager");		
	}
	public void raiseSalary(){
		super.salary+=10000;
	}
}
interface Employees{
	void mainMenu();
	void create();
	void dispaly();
	void raiseSalary();
}
class EmpData implements Employees{
	Emp[] emp;
	Employee(){
		emp=new Emp[100];
	}
	public void mainMenu(){
		System.out.print("----------------------------------");
		System.out.print("1. Create");
		System.out.print("2. Display");
		System.out.print("3. Raise Salary");
		System.out.print("4. Exit");
		System.out.print("----------------------------------");
		System.out.print("Enter Choice :- ");
		int ch= (new Scanner(System.in)).nextInt();
		switch(ch){
			case 1: create();
				  break;
			case 2: display();
				  break;
			case 3: raiseSalary();
				  break;
			case 4: System.exit(0);

			default: System.out.println("Please Enter valid choice:");
		}

		

	}
	public void create(){
		System.out.print("----------------------------------");
		System.out.print("1. Clerk");
		System.out.print("2. Programmer");
		System.out.print("3. Manager");
		System.out.print("4. Exit");
		System.out.print("----------------------------------");
		System.out.print("Enter Choice :- ");
		int ch= (new Scanner(System.in)).nextInt();
		Emp e;
		
		if(ch==1 and emp.length!=100){
			e=new Clerk();
			emp[emp.length]=e;
				
		}
		else if(ch==2 and emp.length!=100){
			e=new Programmer();
			emp[emp.length]=e;
				
		}
		else if(ch==3 and emp.length!=100){
			e=new Manager();
			emp[emp.length]=e;
				
		}
		
		
		else if(ch==4 and emp.length!=100){
			this.mainMenu();
				
		}
		
		else{
			System.out.println("Seems like you entered wrong choice. Please select again Or the maximum limit of objects have been created.");
			this.create();
		}


		
	}
	public void display(){

		for(Emp x : this.emp){
			x.display();
		}
		this.mainMenu();

	}
	public void raiseSalary(){

		System.out.println("Raising Salary Of Employees");
		for(Emp x : this.emp){
			x.raiseSalary();
		}
		this.mainMenu();
	
	}

}
public class EmployeeMain{
	public static void main(String args[]){
		Employees e=new EmpData();
		e.mainMenu();
	}

}
	