package journey1;
import java.util.Scanner;
public class journey1 {

	public static void main(String[] args) {
Scanner scan =new Scanner (System.in);
System.out.println("enter your first name and lastname");
String firstname=scan.next();
String lastname=scan.next();
System.out.println(joinStrings(firstname,lastname));
	}
	public static String joinStrings(String str1,String str2)
	{
		return str1+str2;
	}

}
