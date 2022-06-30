# Greatest_number
//0 1 1 2 3 5 8 13..

import java.util.Scanner;

public class fibonaccie1 {

	public static void main(String[] args) {
		
		int n,a=0,b=1,c;
		System.out.print("Enter the number: ");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
					
		}
    }

}
	


