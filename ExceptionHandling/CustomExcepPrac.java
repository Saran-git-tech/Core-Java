package aug20.pack;

import java.util.Scanner;

class VovelException extends Exception{
	
	public VovelException(String str)
	{
		super(str);
	}
}





public class CustomExcepPrac {
	
	static void validate(String s) throws VovelException{
		   
		if(s.indexOf('a') == -1 && s.indexOf('e') == -1 && s.indexOf('i') == -1 && s.indexOf('o') == -1 && s.indexOf('u') == -1 )
		{
			throw new VovelException("No vovels found");
		}
		else {
			System.out.println("vovel found thankyou");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.next();
		
		try{
			validate(s);
		}
		catch(VovelException ve){
			System.out.println("Exception occured " + ve.getMessage());
		}
		finally {
		 sc.close();
		 System.out.println("Scanner Closed");
		}
		
		System.out.println("code run successfully");

	}

}
