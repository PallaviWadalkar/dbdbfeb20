import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int [][] arr = new int [3][3];
		System.out.println("Enter the element in array::");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++) 
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter the element to be searched::");
		int search = sc.nextInt();
		for (int i=0; i<3 ; i++)
		{
			for(int j=0;j<3;j++)
			{
				if(search==arr[i][j]) 
				{
					System.out.println("Element Present at ::" +i + j+ "index");
				}
			}
		}

	}

}
