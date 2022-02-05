import java.util.Scanner;
import java.util.*;
import java.lang.Math;
public class Program55 {
public static void checkPrimeNumber(int i)
	{
		int k=0;
		for(int j=2;j<=i/2;++j)
		{
			if(i%j==0)
			{
				k=1;
				break;
			}}
		if(k==0)
		{
		System.out.println("The Number is Prime ");
		}
		else
		{
			System.out.println("The Number is Not a Prime ");
		}
		
	}
public static void checkAmstrongNumber(int i)
{
	double sum=0;
	int k,c=0;
	k=i;
	while(i!=0)
	{
		i=i/10;
		c++;
	}
	i=k;
	while(i!=0)
	{
		int r=i%10;
		sum=sum + Math.pow(r,c);
		i=i/10;
		
	}
	if(sum==k)
	{
		System.out.println("The Given number is Armstrong");
	}
	else
	{
		System.out.println("The Given number is not a Armstrong");
	}
}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number to Check Prime Numbers or Armstrong Number");
		Scanner sc= new Scanner (System.in);
		int i = sc.nextInt();
			checkPrimeNumber(i);
			checkAmstrongNumber(i);
		

	}

}