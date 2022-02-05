import java.util.Scanner;
public class Program52 {
	
	public static void main(String[]args) {
		System.out.println("Enter a number:");
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print("The factor of the Given number "+n+" are:");

		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				
				System.out.print(i+ " ");
			}
		}
	}

}
