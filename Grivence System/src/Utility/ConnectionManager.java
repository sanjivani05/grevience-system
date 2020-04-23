package Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	public Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con =null;
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","system");
		if(con!=null)
			System.out.println("Establish");
		
		return con;
		
		
	}
}

//package Utility;
//
//import java.io.InputStream;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.util.Properties;
//
//
//
//public class ConnectionManager {
//	  
//	public static Properties loadPropertiesFile() throws Exception 
//	   {
//		Properties prop = new Properties();
//		InputStream in = ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
//		prop.load(in);in.close();
//		return prop; 
//	   } 
//	public static Connection getConnection() throws ClassNotFoundException, SQLException {
//		
//		Properties prop = null;
//		try {
//			prop = loadPropertiesFile();
//		} catch (Exception e1) {
//			
//			e1.printStackTrace();
//		}
//		final String driver = prop.getProperty("driver");
//		final String url = prop.getProperty("url");
//		final String username = prop.getProperty("username");
//		final String password = prop.getProperty("password");
//		
//		Class.forName(driver);
//	
//		Connection con = null;
//		con = DriverManager.getConnection(url,username,password);
//		return con;
//	}
//}
