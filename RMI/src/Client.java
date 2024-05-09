import java.rmi.Naming;
import java.util.Scanner;

public class Client{
	
	public static void main(String args[]) {
		try {
			PrintI ans = (PrintI) Naming.lookup("rmi://localhost/A");
			
//			System.out.println("Enter Number:");
//			Scanner sc = new Scanner(System.in);
//			int x = sc.nextInt();
			if(ans.is_palindrome(1010)) {
				System.out.println("Number is a Palindrome.");
			}else {
				System.out.println("Number is not a Palindrome.");
			}
			
//			System.out.println("Enter String:");
//			String str = sc.nextLine();
			if(ans.is_palindrome("RAM")) {
				System.out.println("String is a Palindrome.");
			}else {
				System.out.println("String is not a Palindrome.");
			}
			
		}catch(Exception e) {
			System.err.println("Exception occured at Client : " + e.getMessage());
		}
	}
}