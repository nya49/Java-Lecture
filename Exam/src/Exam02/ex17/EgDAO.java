package Exam02.ex17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class EgDAO {
	
	private Connection conn;
	private static final String USERNAME = "javauser";
	private static final String USERPASSWORD = "javauser";
	private static final String URL = "jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false";
	
	public EgDAO() {		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USERNAME, USERPASSWORD);
		}  catch (Exception ex) {
            ex.printStackTrace();
		}	
	}
	
	public void insertEg(EgDTO eDao) {		
		
        String query = "insert into eagles values (?, ?, ?, ?, ?, ?, ?, ?);";
        PreparedStatement pStmt = null;
	       
        try { 
	        	
	        pStmt = conn.prepareStatement(query);
	        pStmt.setInt(1, eDao.getBack_no());
	        pStmt.setString(2, eDao.getName());
	        pStmt.setString(3, eDao.getPos());
	        pStmt.setString(4, eDao.getH_school());
	        pStmt.setString(5, eDao.getT());
	        pStmt.setString(6, eDao.getHit());
	        pStmt.setString(7, eDao.getYeras());
	        pStmt.setInt(8, eDao.getAnnual_income());
	        
	            
	        pStmt.executeUpdate();
           
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
    }
	
	public EgDTO selectOne(int back_no) {		
        String query = "select * from eagles where back_no=?;";
        PreparedStatement pStmt = null;
        EgDTO eDto = new EgDTO();
        try { 
	        pStmt = conn.prepareStatement(query);
	        pStmt.setInt(1, back_no);
	        ResultSet rs = pStmt.executeQuery();
           
	        while(rs.next()){
	        	eDto.setBack_no(rs.getInt(1));
	        	eDto.setName(rs.getString(2));
	        	eDto.setPos(rs.getString(3));
	        	eDto.setPos(rs.getString(4));
	        	eDto.setH_school(rs.getString(5));
	        	eDto.setT(rs.getString(6));
	        	eDto.setHit(rs.getString(7));
	        	eDto.setYeras(rs.getString(8));
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
        return eDto;
    }
	
	public void updateEg(EgDTO eDto) {	
		
        String query = "update eagles set name=?, pos=?, h_school=?, t=?, hit=?, years=?, annual_income=? where back_no=?;";
        PreparedStatement pStmt = null;
        try { 
	        	
	        pStmt = conn.prepareStatement(query);
	        pStmt.setString(1, eDto.getName());
	        pStmt.setString(2, eDto.getPos());
	        pStmt.setString(3, eDto.getH_school());
	        pStmt.setString(4, eDto.getT());
	        pStmt.setString(5, eDto.getHit());
	        pStmt.setString(6, eDto.getYeras());
	        pStmt.setInt(7, eDto.getAnnual_income());
	        pStmt.setInt(8, eDto.getBack_no());
	            
	        pStmt.executeUpdate();
           
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
    }
	
}
