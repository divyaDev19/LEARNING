package galactic;

import java.util.Scanner;

public class Galactic {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter 2 numbers");
		long num1=scan.nextLong();
		long num2=scan.nextLong();
		System.out.println(galatic(num1,num2));
	}
	public static long galatic(long num1,long num2)
	{
		return num1+num2;
		


	}

}
