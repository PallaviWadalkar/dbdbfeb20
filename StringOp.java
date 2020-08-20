
public class StringOp implements StringOperation 
{
	@Override
	public void reverse(String str) 
	{
		// TODO Auto-generated method stub
		System.out.println("Reveser String:");
		for(int i=str.length();i>0;i--)
		{
			System.out.println(str.charAt(i-1));
		}		
	}

	@Override
	public void toUpperCase(String str) 
	{
		// TODO Auto-generated method stub
		
		String result=" ";
		char ch=' ';
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				
				ch=(char)(str.charAt(i)-32);
			}
			
			else
			{
				ch=(char)(str.charAt(i));
			}
			result+=ch;
			
			}
		System.out.println("Uppercase is::" +result);
				
	}
	
	@Override
	public int Length(String str) 
	{
		// TODO Auto-generated method stub
		int i=0;
		for(char c:str.toCharArray())
		{
			i++;
		}
		System.out.println("Lenghth of string is:"+i);
	
		return i;
	}

	@Override
	public boolean isPalindrome(String str) 
	{
		// TODO Auto-generated method stub
		String  rev = "";
		int length = str.length();
		 for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + str.charAt(i);
	 
	      if (str.equals(rev))
	         System.out.println(str+" is a palindrome");
	      else
	         System.out.println(str+" is not a palindrome");
		return false;
	}
	
}
