import java.sql.*;
public class Demo {
public static void main(String[]args) {
		
		String URL="jdbc:mysql://localhost:3306/apsara";
		String username="root";
		String pwd="mysqlap@123";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
Connection c=DriverManager.getConnection(URL,username,pwd);
Statement s=c.createStatement();
ResultSet r=s.executeQuery("SELECT* FROM students WHERE roll<=2");
while(r.next()) {
	System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getString(3));
}
c.close();
		}catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
