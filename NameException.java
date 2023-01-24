package emp.exception;
import java.util.*;
public class NameException extends Exception{
	public NameException(){
	}
	public NameException(String msg){
		super(msg);
	}
	public static String readName(){
		Scanner sc=new Scanner(System.in);
		while(true){
			try{
				System.out.print("Enter name: ");	
				String name=sc.nextLine();
				for(int i=0;i<name.length();i++){
					char x=name.charAt(i);
					if(x==32 || (x>=65 && x<=90) || (x>=97 && x<=122)){
						continue;
					}
					else{
						
						throw new NameException();
					}
				}
				return name;
			}	
			catch(InputMismatchException e){
				System.out.println("please enter a string");
			}
			catch(NameException e){
				System.out.println("please enter only valid characters");
			}
		}
		
	}

}
