import java.util.Scanner;
public class Program63 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String s = sc.nextLine();
		String r = reverse(s);
	    System.out.println("The reversed sentence is: " + r);

		
		
	}
	private static String reverse(String s) {
		// TODO Auto-generated method stub
		if (s.isEmpty())
		      return s;
	    return reverse(s.substring(1)) + s.charAt(0);
	}

}
