import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class server{
	
	public static void main(String args[]) throws RemoteException, MalformedURLException {
		try {
			Registry registry = LocateRegistry.createRegistry(1099);
			PrintC ans = new PrintC();
			registry.bind("A", ans);
			System.out.println("Server Started ... ");
		}catch(Exception e) {
			System.err.println("Exception occured at Server : " + e.getMessage());
		}
	}
}