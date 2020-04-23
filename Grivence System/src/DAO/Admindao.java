package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.Adminlogin;
import Model.Register;
import Utility.ConnectionManager;

public class Admindao {
	public static void addAdmin(Adminlogin adminlogin)throws ClassNotFoundException, SQLException
	{
	String name= adminlogin.getAdminname();
	String pass=adminlogin.getAdminpass();
	ConnectionManager cm =new ConnectionManager(); 
	String sql ="insert into Adminlogin(name,pass)VALUES(?,?)";
	PreparedStatement st = cm.getConnection().prepareStatement(sql);
	
	st.setString(1, name);
	st.setString(2, pass);
	//ResultSet rs=st.executeQuery("SELECT * from Adminlogin");
	//st.executeUpdate();
	
	cm.getConnection().close();
}
}
