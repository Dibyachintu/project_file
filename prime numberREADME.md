# Greatest_number
import java.util.Scanner;

//2,3,5,7,11,13,17
public class primenumber {

	public static void main(String[] args) {
		
		int n,count=0;
		System.out.print("Enter any number: ");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.print("Prime number");
		}
		else
		{
			System.out.print("Not prime number");
		}
	}

}
