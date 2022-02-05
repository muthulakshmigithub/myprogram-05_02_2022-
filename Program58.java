import java.util.Scanner;
public class Program58 {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a number");
		 int n = sc.nextInt();

	        int sum = fact(n);
	        System.out.println("The factorial of " +n+ " = "+ sum);
	    }

	    public static int fact(int num) {
	        if (num >= 1)
	            return num * fact(num - 1);
	        else
	            return 1;
	    }

}
