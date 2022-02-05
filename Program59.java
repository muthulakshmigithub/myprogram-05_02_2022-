import java.util.Scanner;
public class Program59 {
	
	public static void main(String[]args) {
		
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int g = gc(n1,n2);
		System.out.println("The GCD is "+g);
		
		
	}

	private static int gc(int n1, int n2) {
		// TODO Auto-generated method stub

		if(n2!=0)
			return gc(n2,n1 % n2);
		else 
			return n1;
		
	}

}
