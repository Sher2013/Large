import java.util.Scanner;

public class FourNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number   :");
		int num1=scan.nextInt();
		System.out.println("Enter the second number  :");
		int num2=scan.nextInt();
		System.out.println("Enter the third number   :");
		int num3=scan.nextInt();
		System.out.println("Enter the fourth number  :");
		int num4=scan.nextInt();
		
		if ((num1>num2)&&(num1>num3)&&(num1>num4))
		{
			System.out.println("Greatest of the entered value is "+num1);
			
		}
		else if ((num2>num3)&&(num2>num4))
		{
			System.out.println("Greatest of the entered value is "+num2);
			
		}
		else if(num3>num4)
		{
			System.out.println("Greatest of the entered value is "+num3);
			
		}
		else 
		{
			System.out.println("Greatest of the enteres value is "+num4);
		}

	}

}
