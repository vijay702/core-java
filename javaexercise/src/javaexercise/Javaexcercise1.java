package javaexercise;
import java.util.Scanner;
public class Javaexcercise1 {

	public static void main(String[] args) {
		
	
		double bsp,sp;
		int Grade;
		Scanner in=new Scanner(System.in);
		System.out.print("enter the basic sales price");
		bsp=in.nextDouble();
		
		System.out.print("enter the grade of product");
		Grade=in.nextInt();
		
switch(Grade)		
{
	case 1:
		sp=bsp;
		break;
	case 2:
		sp=bsp+0.125*bsp;
		break;
	case 3:
		sp=bsp+0.15*bsp;
		break;
	default:
		sp=bsp+0.15*bsp;
		}
System.out.printf("sales price is %2f",sp);
	}
}