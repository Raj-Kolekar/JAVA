import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class server {

	public static void main(String args[]) throws RemoteException {
		try {
			Registry registry = LocateRegistry.createRegistry(1099);
			PrintC obj = new PrintC();
			registry.bind("A", obj);
			System.out.print("Server Started");
		}catch(Exception e) {
			System.err.print("Exception: "+ e.getMessage());
		}
		
		
		
	}

}
