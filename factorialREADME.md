# Greatest_number
//5!=5*4*3*2*1
import java.util.Scanner;


public class factorial {

	public static void main(String[] args) {
		
	  int n, fact=1;
	  System.out.print("Enter any number: ");
	  Scanner s=new Scanner(System.in);
	  n=s.nextInt();
	  
	  for (int i=1;i<=n;i++)
	  {
		  fact=fact*i;
	  }
	  System.out.print("factorial: "+fact);

	}

}
