package Exam02.ex16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class MemberDAO {
	
	private Connection conn;
	private static final String USERNAME = "javauser";
	private static final String USERPASSWORD = "javauser";
	private static final String URL = "jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false";
	
	public MemberDAO() {		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USERNAME, USERPASSWORD);
		}  catch (Exception ex) {
            ex.printStackTrace();
		}
	}	//MemberDAO 
	
	public MemberDTO login(int id) {		
        String query = "select * from member where id=?;";
        PreparedStatement pStmt = null;
        MemberDTO mem = new MemberDTO();
        try { 
	        pStmt = conn.prepareStatement(query);
	        pStmt.setInt(1, id);
	        ResultSet rs = pStmt.executeQuery();
           
	        while(rs.next()){
	        	mem.setId(rs.getInt(1));
	        	mem.setPass(rs.getString(2));
	        }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
	        try {
	            if (pStmt != null && !pStmt.isClosed());
	            pStmt.close();
	        } catch (SQLException se) {
	            se.printStackTrace();
	        }
        }
        return mem;
    }
}
