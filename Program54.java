import java.util.Scanner;
import java.util.*;
public class Program54 {

	public static void checkPrimeNumber(int i)
	{
		int k=0;
		for(int j=2;j<=i/2;++j)
		{
			if(i%j==0)
			{
				k=1;
				break;
			}
			
		}
		if(k==0)
		{
		System.out.print(i+" ");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number to Check Prime Numbers");
		Scanner sc= new Scanner (System.in);
		int a = sc.nextInt();
		int b=sc.nextInt();
		for(int i=a;i<=b;i++)
		{
			checkPrimeNumber(i);
		}
		

	}

}