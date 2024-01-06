package JavaPackage;



import java.util.Scanner;

public class Temperature {



	public static void main(String arg[])	{


		double f,c,k;

		Scanner sc = new Scanner(System.in);	

		System.out.println("Enter  Celsius temperature");

		c = sc.nextDouble();

		f = (1.8*c) + 32;

		k = (c + 273);

		System.out.println("Fahrenheit temperature is ABC = " + f);

		System.out.println("Kelvin temperature is = " + k);


	}
}	
