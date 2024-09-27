import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class DisplayCustomer implements CommonInterface{

	public static void Display() throws Exception
	{
		Connection con=DriverManager.getConnection(url,username,pass);
		String Query="Select * from Customer";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(Query);
		while(rs.next())
		{
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
		}
//		System.out.println(rs.getInt(1));
	}
		
	public static void main(String[] args) throws Exception
	{
		Display();
	}
}
