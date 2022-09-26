import java.util.Scanner;

public class Program2 {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int n=scan.nextInt();
		int i=1, r;
		for(i=1;i<=n;i++)
		{
			r=2*i-1;
			System.out.print(r+" ");
		}
	
		

	}

}
