package divya;

import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter 2 Numbers");
	int num1=scan.nextInt();
	int num2=scan.nextInt();
	System.out.println(subractNumbers(num1,num2));
	System.out.println("enter 2 numbers");
	num1=scan.nextInt();
	num2=scan.nextInt();
	System.out.println(multiplyNumbers(num1,num2));
	System.out.println("enter 2 numbers");
	num1=scan.nextInt();
	num2=scan.nextInt();
	System.out.println(divideNumbers(num1,num2));
	System.out.println("enter 2 numbers");
	num1=scan.nextInt();
	num2=scan.nextInt();
	System.out.println("enter 2 numbers");
	num1=scan.nextInt();
	num2=scan.nextInt();
	System.out.println(findRemainder(num1,num2));
	}
	public static int subractNumbers(int num1,int num2)
	{
		return num2-num1;
	}
	public static int multiplyNumbers(int num1,int num2)
	{
		return num2*num1;
	}
	public static int divideNumbers(int num1,int num2)
	{
		return num2/num1;
	}
	
	public static int findRemainder(int num1,int num2)
	{
		return num2%num1;
	}

}


	
	

	

	


