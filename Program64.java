import java.util.Scanner;
public class Program64 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Basevand Power");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = pow(a,b);
		System.out.println(a + "^" +b+ "=" +k);
		
		
	}

	private static int pow(int a, int b) {
		// TODO Auto-generated method stub
		if(b!=0) {
			
			return(a*pow(a,b-1));
		}
		else
			return 1;
		}
	}


