import java.util.Scanner;
public class Program57 {
	
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a number");
		 int n = sc.nextInt();

	        int sum = addNumbers(n);
	        System.out.println("Sum = " + sum);
	    }

	    public static int addNumbers(int num) {
	        if (num != 0)
	            return num + addNumbers(num - 1);
	        else
	            return num;
	    }
	}