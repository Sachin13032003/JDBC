package com.Sachin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateJdbc {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String name1="Arijit";
		String email1="das1234";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		System.out.println("sucess");
		PreparedStatement ps1=con1.prepareStatement("update info set Name=? where email=?");
		ps1.setString(1,name1);
		ps1.setString(2,email1);
		int j=ps1.executeUpdate();
		if(j>0) {
			System.out.println("sucessfully");
		}
		else {
			System.out.println("fail");
		}
		PreparedStatement ps2 = con1.prepareStatement("delete from info where Name='Arijit'");
		ps2.executeUpdate();
		con1.close();
	}

}
