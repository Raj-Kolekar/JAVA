import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class server{
	
	public static void main(String args[]) throws RemoteException, MalformedURLException {
		try {
			LocateRegistry.createRegistry(1099);
			PrintC ans = new PrintC();
			Naming.rebind("palindrome", ans);
			System.out.println("Server Started ... ");
		}catch(Exception e) {
			System.err.println("Exception occured at Server : " + e.getMessage());
		}
		
		
	}
}