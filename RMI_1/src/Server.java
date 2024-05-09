import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			LocateRegistry.createRegistry(1099);
			PrintC Calculator = new PrintC();
			Naming.rebind("calculatorService", Calculator);
			System.out.println("Server Started...");
		}
		catch(Exception e) {
			System.err.println("Exception: " + e.getMessage());
		}
	}

}
