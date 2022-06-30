import java.util.Scanner;

public class Displaydata {

	public static void main(String[] args) {
		
		int i;
		long l1;
		float f;
		double d;
		char c;
		Scanner s=new Scanner(System.in);
		i=s.nextInt();
		l1=s.nextLong();
		f=s.nextFloat();
		d=s.nextDouble();
		c=s.next().charAt(0);
		System.out.println(i);
		System.out.println(l1);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);

	}

}
