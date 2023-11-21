package dsaAddandFacto;

import java.util.Scanner;

public class Add {
	public static int RecursiveAdd(int num) {
		if(num==0)
		{
			return 0;
		}
		else if(num==1) {
			return 1;
		}
		else {
			return num+RecursiveAdd(num-1);
		}
	}
	public static int Factorial(int num) {
		// TODO Auto-generated method stub
		if(num==0)
		{
			return 0;
		}
		else if(num==1) {
			return 1;
		}
		else {
			return num*Factorial(num-1);
		}
		
		
	}
	
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
	System.out.println(" the sum of given number is "+RecursiveAdd(num));
	System.out.println(" the factorial of given number is "+Factorial(num));
}

}
