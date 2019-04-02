package basic01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteMain {

	public static void main(String[] args) {
		 Connection conn = null;
	        try {
	        	
	            Class.forName("com.mysql.jdbc.Driver");	
	            conn = DriverManager.getConnection(
	                "jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false",
	                "javauser", "javauser");															//여기까지 하면 DB연결
	            
	            String query = "delete from song where _id=?";
	            
	            PreparedStatement pStmt = conn.prepareStatement(query);
	            pStmt.setInt(1, 118);
	            
	            
	           pStmt.executeUpdate();
	           
	           conn.close();
	        
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        } finally {
		        try {
		            if (conn != null) conn.close();
		        } catch (SQLException se) {
		            se.printStackTrace();
		        }
	        }
	}
	
}
