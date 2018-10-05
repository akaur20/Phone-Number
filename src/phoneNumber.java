/*
 * Avleen Kaur Period 7
 */
import java.util.Scanner;

public class phoneNumber 
{

	public static void main(String[] args) 
	{
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter your name:");
		String name = in.next();
		System.out.print("Enter your phone number:");
		String phoneNum = in.next();
		
		String formatPhone = "(" + phoneNum.substring(0,3) + ")" + phoneNum.substring(3,6) + "-" + phoneNum.substring(6,10);
		System.out.printf("%-10s %20s", name, formatPhone);
		
	}

}
