package basic03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EaglesDAO {

	private Connection conn;
	private static final String USERNAME = "javauser";
	private static final String USERPASSWORD = "javauser";
	private static final String URL = "jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false";
	
	public EaglesDAO() {		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USERNAME, USERPASSWORD);
		}  catch (Exception ex) {
            ex.printStackTrace();
		}
	}	//EaglesDAO 
	
	// 하나만 선택해서 검색
	public EaglesDTO selectOne(int backNo) {		
        String query = "select * from eagles where back_no=?;";
        PreparedStatement pStmt = null;
        EaglesDTO player = new EaglesDTO();
        try { 
	        pStmt = conn.prepareStatement(query);
	        pStmt.setInt(1, backNo);
	        ResultSet rs = pStmt.executeQuery();
           
	        while(rs.next()){
	        	player.setBackNO(rs.getInt(1));
	        	player.setName(rs.getString(2));
	        	player.setPos(rs.getString(3));
	        	player.setHs(rs.getString(4));
	        	player.setT(rs.getString(5));
	        	player.setHit(rs.getString(6));
	        	player.setYears(rs.getString(7));
	        	player.setAnnualIncome(rs.getInt(8));
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
        return player;
    }	//selectOne
	
	public void insertPlayer(EaglesDTO player) {		
		
        String query = "insert into eagles values (?, ?, ?, ?, ?, ?, ?, ?);";
        PreparedStatement pStmt = null;
	       
        try { 
	        	
	        pStmt = conn.prepareStatement(query);
	        pStmt.setInt(1, player.getBackNO());
	        pStmt.setString(2, player.getName());
	        pStmt.setString(3, player.getPos());
	        pStmt.setString(4, player.getHs());
	        pStmt.setString(5, player.getT());
	        pStmt.setString(6, player.getHit());
	        pStmt.setString(7, player.getYears());
	        pStmt.setInt(8, player.getAnnualIncome());
	            
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
    }	//insertPlayer
	
	public void updatePlayer(EaglesDTO player) {	
		
        String query = "update eagles set name=?, pos=?, h_school=?, t=?, hit=?, years=?, annual_income=? where back_no=?;";
        PreparedStatement pStmt = null;
        try { 
	        	
	        pStmt = conn.prepareStatement(query);
	        pStmt.setString(1, player.getName());
	        pStmt.setString(2, player.getPos());
	        pStmt.setString(3, player.getHs());
	        pStmt.setString(4, player.getT());
	        pStmt.setString(5, player.getHit());
	        pStmt.setString(6, player.getYears());
	        pStmt.setInt(7, player.getAnnualIncome());
	        pStmt.setInt(8, player.getBackNO());
	            
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
    }	//updatePlayer
	
	public List<EaglesDTO> selectPlayerByPos(String pos){
		String sql = "select * from eagles where pos like '" + pos + "';";
		List<EaglesDTO> playerList = selectCondition(sql);
		return playerList;
	}
	
	public List<EaglesDTO> selectPlayersByannualIncome(int annualIncome) {		
        String sql = "select * from eagles where annual_income >= " + annualIncome + ";";
        List<EaglesDTO> playerList = selectCondition(sql);
		return playerList;
    }	//selectPlayers
	
	public List<EaglesDTO> selectAll(){
		String sql = "select * from eagles;";
		List<EaglesDTO> playerList = selectCondition(sql);
		return playerList;
	}
	
	public List<EaglesDTO> selectCondition(String query) {		
        PreparedStatement pStmt = null;
        List<EaglesDTO> playerList = new ArrayList<EaglesDTO>();
        try { 
	        pStmt = conn.prepareStatement(query);
	        ResultSet rs = pStmt.executeQuery();
           
	        while(rs.next()){
	        	EaglesDTO player = new EaglesDTO();
	        	player.setBackNO(rs.getInt(1));
	        	player.setName(rs.getString(2));
	        	player.setPos(rs.getString(3));
	        	player.setHs(rs.getString(4));
	        	player.setT(rs.getString(5));
	        	player.setHit(rs.getString(6));
	        	player.setYears(rs.getString(7));
	        	player.setAnnualIncome(rs.getInt(8));
	        	playerList.add(player);
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
        return playerList;
    }	//selectAll
	
	public void deletePlayer(int backNo) {		
		
        String query = "delete from eagles where back_no=?;";
        PreparedStatement pStmt = null;
	       
        try { 
	        	
	        pStmt = conn.prepareStatement(query);
	        pStmt.setInt(1, backNo);

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
    }	//insertPlayer
	
	public void close() {		
        try {
        	if(conn != null && !conn.isClosed())
        		conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
	}	//close
}	//class SongDAO
