import java.io.*;
class Odd extends Thread{
	int limit;
	Odd(int limit){
		this.limit=limit;
	}
	public void run(){
		for(int i=1;i<=limit;i=i+2){
			System.out.println(i);
		}
		
	}
	
}
class Even extends Thread{
	int limit;
	Even(int limit){
		this.limit=limit;
	}
	public void run(){
		for(int i=0;i<=limit;i=i+2){
			System.out.println(i);
		}
	}
}
public class MultiOddEven{

	public static void main(String args[]) throws Exception{

		int limit=Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
		Odd odd=new Odd(limit);
		Even even=new Even(limit);
		odd.start();
		even.start();
		 

	}

}