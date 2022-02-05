import java.util.Scanner;
public class Program61_1 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Decimal");
		int n = sc.nextInt();
		int d = oct(n);
		System.out.println("Decimal to Octal is "+d);
		
	}

	private static int oct(int n) {
		
		int octal=0,i=1;
		while(n!=0) {
			
			octal+=(n%8)*(i);
			i*=10;
			n/=8;
		}
		// TODO Auto-generated method stub
		return octal;


	}

}
