import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class PrintC extends UnicastRemoteObject implements PrintI{

	protected PrintC() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean is_palindrome(int x) {
		int rev = 0;
		while(x != 0) {
			int digit = x % 10;
			rev = rev * 10 + digit;
			x = x / 10;
		}
		if(x == rev) {
			return true;
		}
		return false;
	}

	@Override
	public boolean is_palindrome(String x) {
		
		int s = 0;
		int e = x.length() - 1;
		
		while(s < e) {
			if( x.charAt(s)  != x.charAt(e)) {
				return false;
			}
			s++;
			e--;
		}
		return true;
	}
	
}