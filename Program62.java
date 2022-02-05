import java.util.Scanner;
import java.util.*;
public class Program62 {
	public static int oct(long n)
	{int octa=0;
		int i=0,dn=0;
		long r;
		while(n!=0)
		{
			r=n%10;
			n=n/10;
			dn+=r*Math.pow(2, i);
			i++;
		}
		i=1;
		while(dn!=0)
		{
			octa+=(dn%8)*i;
			dn=dn/8;
			i*=10;
		}
		return octa;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Binary Number");
		Scanner sc= new Scanner(System.in);
		long n = sc.nextLong();
		int o= oct(n);
		System.out.println("Binary to Octal "+o);
	}

}
