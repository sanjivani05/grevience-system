package Controller;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.SQLException;

import DAO.Admindao;
import DAO.userdao;
import Model.Adminlogin;
import Model.Register;

public class main {
			
			public static void main(String args[]) throws NumberFormatException, IOException, ClassNotFoundException, SQLException {
				System.out.println("1 User ");
				System.out.println("2 Admin");
				int x;
				BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
				x=Integer.parseInt(br.readLine());
				
				Register register = new Register();
				userdao udoa= new userdao();
				Admindao admindao =new Admindao();
				Adminlogin adminlogin =new Adminlogin();
				
				
				switch(x)
				{ 
				case 1:
					System.out.println("Enter the email");
					String name = br.readLine();
					System.out.println("Enter the Pass");
					String pass = br.readLine();
					
				//	if(userdao.validate(register)==true)
				//{
						System.out.println("Register Your Complaint");
						System.out.println("Choose OptionBelow");
						System.out.println("1.Product Related Complaint");
						System.out.println("2.Dilevery Related Complaint");
						System.out.println("3.Installation Related Complaint");
						int y;
						y=Integer.parseInt(br.readLine());
						if(y==1);
						{
							System.out.println("Enter the customer name");
							String custname = br.readLine();
							System.out.println("Enter the product name");
							String productname = br.readLine();
							System.out.println("Enter the product id");
							String productid = br.readLine();
							System.out.println("Enter the Date Of Purschase");
							String DOP = br.readLine();
							System.out.println("Enter the email");
							String email = br.readLine();
							System.out.println("Enter the product issue");
							String proissue = br.readLine();
							
							
							register.setCustname(custname);
							register.setProductname(productname);
							register.setProductid(productid);
							register.setDOP(DOP);
							register.setEmail(email);
							register.setProissue(proissue);
						
							
							}
						if(y==2)
						{
							System.out.println("Enter the customer name");
							String custname = br.readLine();
							System.out.println("Enter the product name");
							String productname = br.readLine();
							System.out.println("Enter the product id");
							String productid = br.readLine();
							System.out.println("Enter the Date Of Purschase");
							String DOP = br.readLine();
							System.out.println("Enter the email");
							String email = br.readLine();
							System.out.println("Enter the dilivery issue");
							String proissue = br.readLine();
							
							register.setCustname(custname);
							register.setProductname(productname);
							register.setProductid(productid);
							register.setDOP(DOP);
							register.setEmail(email);
							register.setProissue(proissue);
							}
							
						if(y==3)
						{
							System.out.println("Enter the customer name");
							String custname = br.readLine();
							System.out.println("Enter the product name");
							String productname = br.readLine();
							System.out.println("Enter the product id");
							String productid = br.readLine();
							System.out.println("Enter the Date Of Purschase");
							String DOP = br.readLine();
							System.out.println("Enter the email");
							String email = br.readLine();
							System.out.println("Enter the installement related issue");
							String proissue = br.readLine();
							
							
							register.setCustname(custname);
							register.setProductname(productname);
							register.setProductid(productid);
							register.setDOP(DOP);
							register.setEmail(email);
							register.setProissue(proissue);
							}
							//}//
						register.setName(name);
						register.setPass(pass);
						System.out.println("Complaint Register successfully");
						userdao.addUser(register);
			
						
						break;

			case 2:
					
					 
					System.out.println("Enter the id");
					String Adminname = br.readLine();
				System.out.println("Enter the Password");
				String Adminpass = br.readLine();
					adminlogin.setAdminname(Adminname);
					adminlogin.setAdminpass(Adminpass);
					Admindao.addAdmin(adminlogin);
					
					break;
										
				}
				}
			
				
	}


