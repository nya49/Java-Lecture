package basic02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SongDAO {		
	
	// mySQL 연결
	private Connection conn;
	private static final String USERNAME = "javauser";
	private static final String USERPASSWORD = "javauser";
	private static final String URL = "jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false";
	
	public SongDAO() {		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USERNAME, USERPASSWORD);
		}  catch (Exception ex) {
            ex.printStackTrace();
		}
	}	//SongDAO 
	
	
	// 추가
	public void insertSong(SongDTO song) {		
		
        String query = "insert into song (title, lyrics) values (?, ?);";
        PreparedStatement pStmt = null;
	       
        try { 
	        	
	        pStmt = conn.prepareStatement(query);
	        pStmt.setString(1, song.getTitle());
	        pStmt.setString(2, song.getLyris());
	            
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
    }	//insertSong
	
	
	// 하나만 선택해서 검색
	public SongDTO selectOne(int id) {		
		
        String query = "select * from song where _id=?;";
        PreparedStatement pStmt = null;
	    SongDTO song = new SongDTO();
        try { 
	        pStmt = conn.prepareStatement(query);
	        pStmt.setInt(1, id);
	        ResultSet rs = pStmt.executeQuery();
           
	        while(rs.next()){
	        	song.setId(rs.getInt("_id"));				// rs.getInt(1)
	        	song.setTitle(rs.getString("title"));		// rs.getSting(2)
	        	song.setLyris(rs.getString("lyrics"));		// rs.getSting(3)
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
        return song;
    }	//selectOne
	
	
	// 여러항목 출력
	public List<SongDTO> selectAll() {		// 하나만 선택해서 검색
		
        String query = "select * from song;";
        PreparedStatement pStmt = null;
        List<SongDTO> list = new ArrayList<SongDTO>();
        try { 
	        pStmt = conn.prepareStatement(query);
	        ResultSet rs = pStmt.executeQuery();
           
	        while(rs.next()){
	        	SongDTO song = new SongDTO();
	        	song.setId(rs.getInt("_id"));				// rs.getInt(1)
	        	song.setTitle(rs.getString("title"));		// rs.getSting(2)
	        	song.setLyris(rs.getString("lyrics"));		// rs.getSting(3)
	        	list.add(song);
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
        return list;
    }	//selectAll
	
	
	// 업데이트
	public void updateSong(SongDTO song) {	
		
        String query = "update song set title=?, lyrics=? where _id=?;";
        PreparedStatement pStmt = null;
        try { 
	        	
	        pStmt = conn.prepareStatement(query);
	        pStmt.setString(1, song.getTitle());
	        pStmt.setString(2, song.getLyris());
	        pStmt.setInt(3, song.getId());
	            
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
    }	//updateSong
	
	// 삭제
	public void deleteSong(SongDTO song) {		
		
        String query = "delete from song where _id=?;";
        PreparedStatement pStmt = null;
        try { 
	        pStmt = conn.prepareStatement(query);
	        pStmt.setInt(1, song.getId());
           
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
    }	//deleteSong
	
	// 닫기
	public void close() {		
        try {
        	if(conn != null && !conn.isClosed())
        		conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
	}	//close
}	//class SongDAO
