import java.sql.*;


public class JDBC_demo {

	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/orginal" , "root" , "raj123");
			Statement stat = con.createStatement();
			System.out.println("JDBC Connected...");
			String sql = "SELECT * FROM student";
			//ResultSet rs = stat.executeQuery(sql);
			
			ResultSet rs = stat.executeQuery(sql);
			
			while(rs.next()) {
				
				int r = rs.getInt("ROLL_NO");
				String n = rs.getString("name");
				System.out.println("Roll No:" + r);
				System.out.println("name:" + n);
			}
			rs.close();
			stat.close();
			con.close();
			
		}catch(Exception e) {
			System.err.println("Exceptio :" + e.getMessage());
		}

	}

}
