import java.util.Scanner;

public class FactorialNumber {
	
   static long factorial(long num) {
	  if(num==1)
	  return 1;
	  
	  return num*factorial(num-1);
  }
	
	
	public static void main(String [] args ) {
		
		
		long num=5;

		
		System.out.println(factorial(num));
	
		
		
		
	}

}
