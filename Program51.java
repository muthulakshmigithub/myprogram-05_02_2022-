import java.util.Scanner;
public class Program51 {
	
	public static void main(String[]args) {
		
		System.out.println("Enter the first number and last number to check intervels");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		for(int n=n1+1;n<=n2;n++) {
			double sum =0;
		    int k, c=0;
		    k=n;
			while(k!=0) {
				k=k/10;
				c++;
		}
		
		
		k=n;
		while(k!=0) {
			
			int r=k%10;
			sum=sum + Math.pow(r,c);
			k=k/10;
			
		}
		
		if(sum==n) 
		{
			System.out.print(n+" ");

		}
		
			
			
		
	}}

	
}
