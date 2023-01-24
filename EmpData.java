package emp.util;
import java.util.*;


public class EmpData implements Employees{
	private Vector emp;
	//private int counter;
	public EmpData(){
		emp=new Vector();
		//counter=0;
	}
	
	public void mainMenu(){
		System.out.println("----------------------------------");
		System.out.println("1. Create");
		System.out.println("2. Display");
		System.out.println("3. Raise Salary");
		System.out.println("4. Exit");
		System.out.println("----------------------------------");
		System.out.print("Enter Choice :- ");
		try{
			
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
				   this.mainMenu();
			}
		}
		catch(InputMismatchException e){
			System.out.println("Please enter valid input");
			this.mainMenu();
			
		}
	}
	public void create(){
		System.out.println("----------------------------------");
		System.out.println("1. Clerk");
		System.out.println("2. Programmer");
		System.out.println("3. Manager");
		System.out.println("4. Exit");
		System.out.println("----------------------------------");
		System.out.print("Enter Choice :- ");		
		try{
			
			int ch= (new Scanner(System.in)).nextInt();
		Emp e;
		if(ch==1){
			e=new Clerk();
			
			emp.add(e);
			counter++;
			this.create();		
		}
		else if(ch==2 ){
			e=new Programmer();
			
			emp.add(e);
			counter++;
			this.create();	
		}
		else if(ch==3){
			e=new Manager();
			
			emp.add(e);
			counter++;
			this.create();	
		}
		
		else if(ch==4 ){
			this.mainMenu();		
		}
		else{
			System.out.println("!Seems like you entered wrong choice.!");
			System.out.println("!! Please select again Or the maximum limit of Employees have been created.!!");
			this.create();
		}	
		}
		catch(InputMismatchException e){
			System.out.println("Please enter valid input");
			this.create();
			
		}		
		
	}
	public void display(){
		if(Emp.counter==0){
			System.out.println("No Employees Found. Please Create Employees First");
			this.mainMenu();
			return;
		}
		System.out.println("=============Employee Details=============");
		Enumeration e=emp.elements();

		/*for(int i=0;i<counter;i++){
			//emp[i].display();
			System.out.println(emp[i]);
		}*/
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
	
		this.mainMenu();

	}
	public void raiseSalary(){
		if(counter==0){
			System.out.println("No Employees Found. Please Create Employees First");
			this.mainMenu();
			return;
		}
		System.out.println("=============Raising Salary Of Employees=============");
		/*for(int i=0;i<counter;i++){
			emp[i].raiseSalary();
		}*/

		Enumeration e=emp.elements();
		while(e.hasMoreElements()){
			Emp x=(Emp) e.nextElement();
			x.raiseSalary();
		}
		
		System.out.println("=============Updated Details=============");
		this.display();
	}

}