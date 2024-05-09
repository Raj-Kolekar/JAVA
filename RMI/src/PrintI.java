import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PrintI extends Remote{
	public boolean is_palindrome(int x) throws RemoteException;
	public boolean is_palindrome(String x)throws RemoteException;
	
}