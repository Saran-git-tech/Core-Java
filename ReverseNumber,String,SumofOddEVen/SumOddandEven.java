package task.pack;

import java.util.Scanner;

public class SumOddandEven {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length : ");
		int n = sc.nextInt();
		
		System.out.println("Enter the Values : ");
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the option to calculate sum ||---- Odd or Even---- || : ");
		String option = sc.next();
		
		switch(option){
			
		case "Odd":
			int Oddsum = 0;
			for(int i  = 0; i < n; i++)
			{
				if(arr[i] % 2 != 0)
				{
				     Oddsum+=arr[i];
				}
			}
			System.out.println(Oddsum);
			break;
			
		case "Even":
			int Evensum = 0;
			for(int i  = 0; i < n; i++)
			{
				if(arr[i] % 2 == 0)
				{
				     Evensum+=arr[i];
				}
			}
			System.out.println(Evensum);
			break;
			
		 default:
			 System.out.println("Invalid input");
		}
      sc.close();
	}

}
