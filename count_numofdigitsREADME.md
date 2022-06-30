# Greatest_number
import java.util.Scanner;

public class count_thenumberofdigits {

	public static void main(String[] args) {
		
		int n,count=0;
		System.out.print("Enter the number: ");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		
		while(n>0)
		{
			n=n/10;
			count++;
		}
		System.out.print("No. of Digits "+count);


	}

}
