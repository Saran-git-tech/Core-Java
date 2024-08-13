package aug13.pack;

import java.util.Scanner;

public class PrintEvenOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the limit : ");
		int n = sc.nextInt();
		
		System.out.println("Enter Odd or Even : ");
		String oddOrEven = sc.next();
		
		switch(oddOrEven) {
		       
		case "Odd" :
			
			System.out.println("Odd Numbers Are: ");
			
			for(int i = 1; i <= n; i++)
			{
				if((i % 2) != 0)
				{
					System.out.print(i + " ");
				}
			}
			break;
			
		case "Even" :
			
			System.out.println("Even Numbers Are: ");
			
			for(int i = 1; i <= n; i++)
			{
				if((i % 2) == 0)
				{
					System.out.print(i + " ");
				}
			}
			break;
		
		default :
			System.out.println("Invalid Input");
		
		}
		

	}

}
