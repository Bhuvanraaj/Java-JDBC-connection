import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteCustomer implements CommonInterface {

	public static void delete() throws Exception
	{
		Connection con=DriverManager.getConnection(url,username,pass);
		String query="Delete from Customer where name=?";
		PreparedStatement st=con.prepareStatement(query);
		st.setString(1,"ThenMozhi");
		st.executeUpdate();
		con.close();
		
	}
	
	
	public static void main(String[] args) throws Exception
	{
		delete();
	}
	
}
