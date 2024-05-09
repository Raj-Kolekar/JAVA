import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class PrintC extends UnicastRemoteObject implements PrintI{

	protected PrintC() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean is_palindrome(int x) throws RemoteException {
		// TODO Auto-generated method stub
		int org = x;
		int rev = 0;
		while(x != 0) {
			int digit = x % 10;
			rev = rev * 10 + digit;
			x = x / 10;
		}
		if(rev == org) {
			return true;
		}
		return false;
	}

	@Override
	public boolean is_palindrome(String str) throws RemoteException {
		int s = 0;
		int e = str.length() - 1;
		
		while(s < e) {
			if(str.charAt(e) != str.charAt(s)) {
				return false;
			}
			s++;
			e--;
		}
		return true;
	}

}
