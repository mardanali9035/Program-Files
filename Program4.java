import java.util.Scanner;
public class Program4
{
	public static void main(String args[] )
	{
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int arr1[]= new int [10];
		System.out.println("Enter the elements:");
		for(int j=0; j<arr1.length;j++)
		{
		arr1[j]= sc.nextInt();
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			int count=0;
			for(int j=0;j<=arr1.length-1;j++)
			{
				if(arr1[j]%arr[i]==0)
				{
					
					count=count+1;
					
				}	
			}
			System.out.print(arr[i] +":"+ count+",");	
		}
		
		
	}
		
}
	
		


