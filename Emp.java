package emp.util;
import emp.exception.*;
import java.util.*;

abstract class Emp{
	 private String name;
	 private int age;
	 private float salary;
	 private String designation;
	 private static int counter;

	Emp(){
		
		this.name=NameException.readName();
		this.age=AgeException.readAge();
		
		System.out.println("No of Employees in organisation: "+ ++counter);
	}
	abstract public void raiseSalary();
	public void setSalary(float x){
		salary=x;
		
	}
	public float getSalary(){
		return salary;	
	}
	public void setDesignation(String desig){
		designation=desig;
	}
	public final void display(){
		System.out.println("\tName : "+name);
		System.out.println("\tAge  : "+age);
		System.out.println("\tSalary : "+salary);
		System.out.println("\tDesignation : "+designation+"\n");
	
	}
	public String toString(){
		return "\tName : "+name+"\n"+"\tAge  : "+age+"\n"+"\tSalary : "+salary+"\n"+"\tDesignation : "+designation+"\n";
	}
	public int getAge(){
		return this.age;
	}
	public String getName(){
		return this.name;
	}
}
final class Clerk extends Emp{
	Clerk(){
		super.setSalary(10000);	
		super.setDesignation("Clerk");
	}
	public void raiseSalary(){
		super.setSalary(super.getSalary()+2000);
	}
	
}
final class Programmer extends Emp{
	Programmer(){
		super.setSalary(25000);
		super.setDesignation("Programmer");
	}
	public void raiseSalary(){
		super.setSalary(super.getSalary()+5000);
	}
}
final class Manager extends Emp{
	Manager(){
		super.setSalary(80000);
		super.setDesignation("Manager");		
	}
	public void raiseSalary(){
		super.setSalary(super.getSalary()+10000);
	}
}