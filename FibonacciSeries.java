import java.util.Scanner;

public class FibonacciSeries
{

	public static void main(String[] args) 
	{
		
			Scanner scan=new Scanner(System.in);
			System.out.println("How many numbers needed in fibonacci series");
			int num=scan.nextInt();
			
			int num1=0;
			int num2=1;
			
			
			if (num==0){
				System.out.println(0);
				
			}
			else if (num==1){
				System.out.println(1);
			}
			
			else
			{
				try
				{
					int arr[]=new int[num];
					arr[0]=num1;
					arr[1]=num2;
					
					for(int i=2;i<arr.length;i++)
					{
						int num3=num1+num2;
						arr[i]=num3;
						num1=num2;
						num2=num3;
						
						
					}
					for(int i=0;i<arr.length;i++)
					{
						System.out.println(arr[i]);
					}
				}
				catch(Exception e)
				{
					System.out.println("Your input is not valid");
				}
			
			}
		
	}

}
