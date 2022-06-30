//a,e,i,o,u--->vowels

import java.util.Scanner;

public class vowel_consonants {

	public static void main(String[] args) {
		
		char ch;
		System.out.print("Enter the character: ");
		Scanner s=new Scanner(System.in);
		ch=s.next().charAt(0);
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.print("vowels");
		}
		else
		{
			System.out.print("Consonants");
		}

     }

}
