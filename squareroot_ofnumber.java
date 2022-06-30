import java.util.Scanner;

public class squareroot_ofnumber {

	public static void main(String[] args) {
		
		int n;
		System.out.print("Enter the number: ");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		
		double m=Math.sqrt(n);
		System.out.print("Square root is: "+m);
	}

}
