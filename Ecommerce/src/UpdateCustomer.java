import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateCustomer implements CommonInterface {
	
	public static void Update() throws Exception{
		Connection con=DriverManager.getConnection(url,username,pass);
		String query="update Customer set name=? where id=?";
		PreparedStatement st=con.prepareStatement(query);
		st.setString(1, "Tamizh");
		st.setInt(2, 7);
		st.executeUpdate();
	}
	public static void main(String [] args) throws Exception
	{
		Update();
	}
}
