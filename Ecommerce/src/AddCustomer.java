import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AddCustomer implements CommonInterface {
	public static void insert() throws Exception 
	{
		Connection con=DriverManager.getConnection(url,username,pass);
		String Query="insert into customer values(?,?,?)";
		PreparedStatement st=con.prepareStatement(Query);
		st.setInt(1, 0);
		st.setString(2,"ThenMozhi");
		st.setString(3, "9442567715");
		try {
		st.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
		con.close();
		
	}
	
	
	
	public static void main(String[] args) throws Exception
	{
		insert();
	}
}
