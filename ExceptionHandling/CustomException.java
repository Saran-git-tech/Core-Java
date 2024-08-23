package aug20.pack;

import java.util.Scanner;

class InvalidAgeException extends Exception{
	
	 public InvalidAgeException(String str) {
		 
		 super(str);
	 }
}


public class CustomException {
	
	static void validate(int age) throws InvalidAgeException{
		
		if(age < 18) {
			throw new InvalidAgeException("age is not valid to vote");
		}
		else {
		   System.out.println("Welcome to vote");
		  }
	}

	public static void main(String[] args) {
		  
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age");
		int n = sc.nextInt();
		
		try {
			validate(n);
		}
		catch(InvalidAgeException iae) {
			   System.out.println("caught the age");
			   
			   System.err.println("exception occured : " + iae);
		}
		finally {
			sc.close();
		}
		
        System.out.println("rest of the code");
	}

}
