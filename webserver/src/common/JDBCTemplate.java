package common;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCTemplate {
//.properties파일의 위치 여부가 중요하다
//src>sql에 properties를 모아놓음 
	
	public static Connection getConnection() {
		
		Connection conn = null;
		Properties prop = new Properties();
		
		System.out.println("url경로:"+JDBCTemplate.class.getResource("/sql/driver.properties").getPath());
		System.out.println("url경로:"+JDBCTemplate.class.getResource("/sql/driver.properties"));
		//Properties 파일의 경로를 URL객체로 반환해서 getPath()를 쓰면 String형의 경로가 됨
		//경로를 뽑아주는 작업 .getPath();
	
		
		String fileName = JDBCTemplate.class.getResource("/sql/driver.properties").getPath();
		
		try {
			prop.load(new FileReader(fileName));
	
			String driver = prop.getProperty("driver");
			String url = prop.getProperty("url");
			String user = prop.getProperty("user");
			String password = prop.getProperty("password");
			Class.forName(driver);
			
			conn=DriverManager.getConnection(url,user,password);
			
			conn.setAutoCommit(false);  //Dafault = true (트랜잭션 처리여부)
			//원칙적으로 application에서 제어야 하므로 나중에 if문으로 따로 commit처리
		}catch(IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void close(Connection conn) {
		try {
			if(conn!=null && !conn.isClosed()) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void close(ResultSet rset) {
		try {
			if(rset!=null && !rset.isClosed()) {
				rset.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void close(Statement stmt) {
		try {
			if(stmt!=null && !stmt.isClosed()) {
				stmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void commit(Connection conn) {
		try {
			if(conn!=null && !conn.isClosed()) {
				conn.commit();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void rollback(Connection conn) {
		try {
			if(conn!=null && !conn.isClosed()) {
				conn.rollback();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

