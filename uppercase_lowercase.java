import java.util.Scanner;

public class uppercase_lowercase {

	public static void main(String[] args) {
		
		char ch;
		System.out.print("Enter the character: ");
		Scanner s=new Scanner(System.in);
		ch=nextChar();
		if(Character.isUpperCase(ch))
		{
			System.out.print("1");
		}
		else if(Character.isLowerCase(ch))
		{
			System.out.print("0");
		}
		else
		{
			System.out.print("-1");
		}

	}

	private static char nextChar() {
		// TODO Auto-generated method stub
		return 0;
	}

	
		
	}


