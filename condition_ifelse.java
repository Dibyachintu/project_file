import java.util.Scanner;

public class condition_ifelse {

	public static void main(String[] args) {
		
		int pwd;
		System.out.print("Enter password: ");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		
		if(pwd==4455)
		{
			System.out.println("My name is dibya");
			System.out.println("My name is chintu");
			System.out.println("My name is smruti");
			System.out.println("My name is Dsmruti");
		}
		else
		{
			System.out.println("Wrong password");
		}

	}

}
