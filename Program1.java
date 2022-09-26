import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;
public class Program1 {

	public static void main(String[] args)
	{
		
		double a, b;

		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the numbers");

		
		a = sc.nextDouble();

		b = sc.nextDouble();

		System.out.println("Enter the operator (+,-,*,/)");

		char op = sc.next().charAt(0);

		double o = 0;

		switch (op) {

		
		case '+':

			o = a + b;

			break;

		
		case '-':

			o = a - b;

			break;

		
		case '*':

			o = a * b;

			break;

	
		case '/':

			o = a / b;

			break;

		default:

			System.out.println("You enter wrong input");

			break;
		}

		System.out.println("The final result:");

		System.out.println();

		System.out.println(a + " " + op + " " + b+ " = " + o);
	}
}
