import java.rmi.Naming;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			PrintI Calculator = (PrintI) Naming.lookup("rmi://localhost/calculatorService");
			int res1 = Calculator.add(5, 96);
			int res2 = Calculator.sub(8, 78);
			
			System.out.println("Addition is:" + res1);
		}catch(Exception e) {
			System.err.println("Exception: " + e.getMessage());
		}
	}

}
