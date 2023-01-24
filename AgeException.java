package emp.exception;
import java.util.*;
public class AgeException extends Exception{
	public AgeException(){
	}
	public AgeException(String msg){
		super(msg);
	}
	public static int readAge(){
		Scanner sc=new Scanner(System.in);
		while(true){
			try{
			System.out.println("Enter Age: ");
			int age=sc.nextInt();
			if(age<21 || age>60){
				throw new AgeException();
			}
			else{
				return age;
			}
			}
			catch(InputMismatchException e){
				System.out.println("please enter a number");
			}
			catch(AgeException e){
				System.out.println("age should be between 21 and 60");
			}
			
			
		}
	}
}