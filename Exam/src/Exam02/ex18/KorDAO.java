package Exam02.ex18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class KorDAO {
	
	private Connection conn;
	private static final String USERNAME = "javauser";
	private static final String USERPASSWORD = "javauser";
	private static final String URL = "jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false";
	
	public KorDAO() {		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USERNAME, USERPASSWORD);
		}  catch (Exception ex) {
            ex.printStackTrace();
		}
	}
	
	public List<KorDTO> selectAll() {	
		String query = "select * from city where Countrycode='kor' and Population>1000000 order by Population desc";
        PreparedStatement pStmt = null;
        List<KorDTO> korList = new ArrayList<KorDTO>();
        try { 
	        pStmt = conn.prepareStatement(query);
	        ResultSet rs = pStmt.executeQuery();
           
	        while(rs.next()){
	        	KorDTO kor = new KorDTO();
	        	kor.setId(rs.getInt(1));
	        	kor.setName(rs.getString(2));
	        	kor.setCountrycode(rs.getString(3));
	        	kor.setDisrtict(rs.getString(4));
	        	kor.setPopulation(rs.getLong(5));
	        	korList.add(kor);
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
        return korList;
    }

}
