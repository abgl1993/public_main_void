package com.sapeint.model;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.sapient.DataAccessObject;
import com.sun.corba.se.pept.transport.Connection;


public class User implements Serializable {
private String email;
private String password;
DataAccessObject dao=new DataAccessObject();

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

/*public boolean validateLogin(String email,String password){
	
	Context ctx = null;
	java.sql.Connection con = null;
	PreparedStatement ps =null;
	ResultSet rs =null;
	
	try {
		ctx = new InitialContext();
		DataSource ds =(DataSource)ctx.lookup("java:comp/env/jdbc/bankDB");
		
		con = ds.getConnection();
		
		ps = con.prepareStatement("SELECT EMAIL_ID,PASSWORD FROM USER_DETAILS WHERE EMAIL_ID=? AND PASSWORD=?");
		
		ps.setString(1, email);
		ps.setString(2, password);
		
		rs = ps.executeQuery();	
		
		if(rs.next()){
			email=rs.getString(1);
			password =rs.getString(2);
			return true;
		}
		return false;
	} catch (NamingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally{
		try {
			if (ctx !=null){
				ctx.close();
			}
			
			if (con !=null){
				con.close();
			}
			if (ps !=null){
				ps.close();
			}
			if (rs !=null){
				rs.close();
			}
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	return false;
}*/

public boolean validateLogin(String email,String password){
	if(dao.validation(email, password))
		return true;
	else
		return false;
}

public void addNewUser(String name,String email,String password,String contactNo,String address)
{
	int uid =(int)Math.random();
	int i=dao.addUser(uid,name,email,password,contactNo,address);
	//System.out.print(name);
}

}
