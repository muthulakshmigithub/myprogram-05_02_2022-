import java.util.Scanner;
public class Program61 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Octal");
		int n = sc.nextInt();
		int d = dec(n);
		System.out.println("Octal to decimal is "+d);
		
	}

	private static int dec(int n) {
		
		int dec=0,i=0;
		while(n!=0) {
			
			dec+=(n%10)*Math.pow(8, i);
			i++;
			n/=10;
		}
		// TODO Auto-generated method stub
		return dec;
	}

}
