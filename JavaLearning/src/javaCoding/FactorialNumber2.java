package javaCoding;

import java.util.Scanner;

public class FactorialNumber2 {

	public static void main(String[] args) {
		/// factorial of 171 is a infinity value ,,, infinity value starts from here 
		
		double num;
		double factorial =1;
		System.out.println(" enter a number ");
		Scanner sc = new Scanner(System.in);
	
		num = sc.nextInt();
	
		for(int i=1; i<=num;i++) {
			
			
			factorial = factorial*i;
			
		}
		System.out.println("the factorial number is " + factorial);

	}

}
