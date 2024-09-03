package task.pack;

import java.util.Scanner;

public class StringReverse {
         
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		
		String s = sc.next();
		
		String ans = "";
		for(int i = 0; i < s.length(); i++)
		{
			ans = s.charAt(i) + ans;
		}
		
		System.out.println(ans);
		sc.close();
	}
}
