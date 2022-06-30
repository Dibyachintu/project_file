//perfect square:-6:1,2,3=6
//28=1,2,4,7,14=28
import java.util.Scanner;

public class Perfectsquare {

	public static void main(String[] args) {
		
		int n,sum=0;
		System.out.print("Enter the number: ");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
			
		}
		if(n==sum)
		{
			System.out.print("Perfect square");
		}
		else
		{

			System.out.print("Not Perfect square");
		}
	}

}
