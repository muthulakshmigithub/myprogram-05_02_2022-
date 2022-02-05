import java.util.Scanner;
public class Program53 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
       System.out.println("Enter two Number");		
       
       int a = sc.nextInt();
       int b = sc.nextInt();
       System.out.println("1.Add 2.sub 3.multi 4.division");
       int n = sc.nextInt();
       switch(n) {
       case 1: System.out.println(a+b);
       break;
       case 2: System.out.println(a-b);
       break;
       case 3: System.out.println(a*b);
       break;
       case 4: System.out.println(a/b);
       break;
       default : System.out.println("The Given number is wrong");
       break;
       }
		
	}
}
