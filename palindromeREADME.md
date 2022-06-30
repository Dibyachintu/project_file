# Greatest_number
//palindrome-121,141...
import java.util.Scanner;


public class palindrome {

	public static void main(String[] args) {
		
		String s="madam";
		String rev="";
		
		
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev))
		{
			System.out.println("Palindrome string");
		}
		else
		{
			System.out.println("Not Palindrome string");
		}
		

	}

}
