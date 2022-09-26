import java.util.Scanner;

public class Program3
{

	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter number");
		int n=scan.nextInt();
		int i=1,r=1;
		if(n%2==0)
		{
			n=n-1;
			for(i=1;i<=n;i++)
			{
				r=2*i-1;
				
				System.out.print(r+" ");
			}
		}
		else
		{
		for(i=1;i<=n;i++)
		{
			r=2*i-1;
			
			System.out.print(r+" ");
		}
		}
		
	}

}
