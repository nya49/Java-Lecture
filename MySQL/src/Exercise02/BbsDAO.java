package Exercise02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class BbsDAO {

	private Connection conn;
	private static final String USERNAME = "javauser";
	private static final String USERPASSWORD = "javauser";
	private static final String URL = "jdbc:mysql://localhost:3306/world?verifyServerCertificate=false&useSSL=false";
	
	public BbsDAO() {		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USERNAME, USERPASSWORD);
		}  catch (Exception ex) {
            ex.printStackTrace();
		}
	}	//MemberDAO 
	
	// 1. 글쓰기    
	public BbsDTO selectOne(int id) {
		String query = "select * from bbs where id=?;";
		PreparedStatement pStmt = null;
		BbsDTO bDto = new BbsDTO();
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, id);
			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {				
				bDto.setId(rs.getInt(1));
				bDto.setMemberid(rs.getInt(2));
				bDto.setTitle(rs.getString(3));
				bDto.setDate(rs.getString(4));
				bDto.setContent(rs.getString(5));
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pStmt != null && !pStmt.isClosed()) 
					pStmt.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		return bDto;
	}
	
	public void updateBbs(BbsDTO bDto) {
		PreparedStatement pStmt = null;
		//String date = getCurrentDBTime();
		String query = "update bbs set title=?, date=now(), content=? where id=?;";
		pStmt = null;
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setString(1, bDto.getTitle());
			//pStmt.setString(2, date);
			pStmt.setString(2, bDto.getContent());
			pStmt.setInt(3, bDto.getId());
			pStmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pStmt != null && !pStmt.isClosed()) 
					pStmt.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}
	
	public void insertBbs(BbsDTO bDto) {
		PreparedStatement pStmt = null;
		String query = "insert into bbs (memberId, title, content) values(?, ?, ?);";
		pStmt = null;
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, bDto.getMemberid());
			pStmt.setString(2, bDto.getTitle());
			pStmt.setString(3, bDto.getContent());		
			pStmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pStmt != null && !pStmt.isClosed()) 
					pStmt.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}
	
	public void deleteBbs(int id) {
		String query = "delete from bbs where id=?;";
		PreparedStatement pStmt = null;
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, id);
			pStmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pStmt != null && !pStmt.isClosed()) 
					pStmt.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}
	
	public BbsMember ViewData(int id) {
		String query = "select bbs.id, bbs.title, member.name, bbs.date, bbs.content from bbs " + 
				"inner join member on bbs.memberId=member.id where bbs.id=?;";;
		PreparedStatement pStmt = null;
		BbsMember bmDto = new BbsMember();
		int result = -1;
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, id);
			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {				
				bmDto.setId(rs.getInt(1));
				bmDto.setTitle(rs.getString(2));
				bmDto.setName(rs.getString(3));
				bmDto.setDate(rs.getString(4));
				bmDto.setContent(rs.getString(5));
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pStmt != null && !pStmt.isClosed()) 
					pStmt.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		return bmDto;
	}
	
	public List<BbsMember> selectJoinAll(int number) {
		String query = "select bbs.id, bbs.title, member.name, bbs.date from bbs " + 
				"inner join member on bbs.memberId=member.id order by bbs.id desc limit ?;";
		PreparedStatement pStmt = null;
		List<BbsMember> bmList = new ArrayList<BbsMember>();
		try {
			pStmt = conn.prepareStatement(query);
			pStmt.setInt(1, number);
			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {	
				BbsMember bmDto = new BbsMember();
				bmDto.setId(rs.getInt(1));
				bmDto.setTitle(rs.getString(2));
				bmDto.setName(rs.getString(3));
				bmDto.setDate(rs.getString(4));
				bmList.add(bmDto);
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pStmt != null && !pStmt.isClosed()) 
					pStmt.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		return bmList;
	}
	
	public String getCurrentDBTime() {
		String query = "select now();";
		PreparedStatement pStmt = null;
		String ts = null;
		try {
			pStmt = conn.prepareStatement(query);
			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {
				ts = rs.getString(1);
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pStmt != null && !pStmt.isClosed()) 
					pStmt.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		return ts;
	}
	
	public void close() {
		try {
			if (conn != null && !conn.isClosed())
				conn.close();
		} catch (Exception se1) { }
	}
}
