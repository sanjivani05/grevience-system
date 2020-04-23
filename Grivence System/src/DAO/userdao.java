 package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import Model.Register;
import Utility.ConnectionManager;
 

public class userdao 

{
	public static boolean validate(Register register) {
		
		// TODO Auto-generated method stub
		return false;
	}
	public static void addUser(Register register)throws ClassNotFoundException, SQLException
	{
	String name= register.getName();
	String pass=register.getPass();
	String custname=register.getCustname();
	String productname=register.getProductname();
	String productid=register.getProductid();
	String DOP=register.getDOP();
	String email=register.getDOP();
	String proissue=register.getProissue();
	
	
	ConnectionManager cm =new ConnectionManager();
	String sql ="insert into Userlogin(NAME,PASS)VALUES(?,?)";
	PreparedStatement st = cm.getConnection().prepareStatement(sql);
	String sql1 ="insert into Complainttable(CUSTNAME,PRODUCTNAME,PRODUCTID,DOP,EMAIL,PROISSUE)VALUES(?,?,?,?,?,?)";
	PreparedStatement st1 = cm.getConnection().prepareStatement(sql1);
	
	st.setString(1, name);
	st.setString(2, pass);
	st1.setString(1, custname);  
	st1.setString(2, productname);
	st1.setString(3, productid);
	st1.setString(4, DOP);
	st1.setString(5, email);
	st1.setString(6, proissue);
	
	st.executeUpdate();
	st1.executeUpdate();
	cm.getConnection().close();
	System.out.println("Inserted sucessfully");
	
	}

	
}  
