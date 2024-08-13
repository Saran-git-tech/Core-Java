package aug13.pack;

import java.util.Scanner;

public class SwitchCase {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("enter the number 1 : ");
		int num1 = sc.nextInt();
		
		System.out.println("enter the number 2 : ");
		int num2 = sc.nextInt();
		
	    System.out.println("Enter the Operation you want to perform : ");
		String operations = sc.next();
		
		switch(operations)
		{
		
		    case "add":
		    	System.out.println("The Sum is : " + (num1 + num2));
		       break;
		       
		    case "sub":
		    	System.out.println("The Sum is : " + (num1 - num2));
		       break;
		       
		    case "multiply":
		    	System.out.println("The Sum is : " + (num1 * num2));
		       break;
		       
		    case "division":
		    	System.out.println("The Sum is : " + (num1 / num2));
		       break;
		    default:
		    	System.out.println("Invalid input");
		
		}
	}

}
