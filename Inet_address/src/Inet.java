import java.net.InetAddress;
import java.net.UnknownHostException;

public class Inet {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress Address = InetAddress.getLocalHost();
		System.out.println("Local Host:" + Address);
		Address = InetAddress.getByName("amazon.com");
		System.out.println("Address of amazon is " +Address); 
		
		InetAddress add[] = InetAddress.getAllByName("www.microsoft.com");
		
		for(int i = 0 ; i < add.length ; i++) {
			System.out.println(add[i]);
		}
	}

}
