import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String::");
		String s=sc.nextLine();
		System.out.println("String is::" +s);
		StringOp s1 = new StringOp();
		s1.reverse(s);
		s1.toUpperCase(s);
		s1.Length(s);
		s1.isPalindrome(s);
		
		
		
	}

}
