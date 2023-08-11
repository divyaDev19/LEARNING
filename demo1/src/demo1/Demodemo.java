package demo1;

import java.util.Scanner;

public class Demodemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your name");
		String name=scan.nextLine();
		greet(name);
	}
	public static void greet(String name) {
		System.out.println("hello"+name+"how are you..?");
	}
		

	

}
