import java.util.Scanner;

public class eToTheNthDigit {
	public static void main(String[] args) {
		int n;
		do {
			Scanner keyboard = new Scanner(System.in);
			String e = Double.toString(Math.E);
			int maxLength = e.length()-1;
			System.out.println("Find e up to nth digit(Minimum is 1 and maximum is "+maxLength+"). Press 0 to quit.");
			n = keyboard.nextInt();
			if(n>0 && n<maxLength) {
				if(n==1) System.out.println(e.substring(0, n));
				else System.out.println(e.substring(0, n+1));
			} else System.out.println("Error. Please enter a number between the bounds.");
		}while(n!=0);
		
		
		
	}
}
