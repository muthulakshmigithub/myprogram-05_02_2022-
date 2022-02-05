import java.util.Scanner;
public class Program60 {

	public static void main(String[] args) {
		System.out.println("Binary to Decimal");
		Scanner sc= new Scanner(System.in);
		long n = sc.nextLong();
	
		int decimal = cbd(n);
		System.out.println(n + " = "+ decimal);
		
	}

	private static int cbd(long n) {
		int decimalNumber = 0, i = 0;
	    long remainder;
	    
	    while (n != 0) {
	      remainder = n % 10;
	      n= n/10;
	      decimalNumber += remainder * Math.pow(2, i);
	      ++i;
	    }
	    return decimalNumber;// TODO Auto-generated method stub
	}
}
