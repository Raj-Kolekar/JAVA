import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		try {
			PrintI obj = (PrintI) Naming.lookup("rmi://localhost/A");
			
			if(obj.is_palindrome("RAR")) {
				System.out.print("Palindrome");
			}else {
				System.out.print("Not Palindrome");
			}
		}catch(Exception e) {
			System.err.print(e.getMessage());
		}
		

	}

}
