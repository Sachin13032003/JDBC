package com.Sachin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class JdbcInsertDemo {
public static void main(String args[]) throws Exception{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
	System.out.println("sucess");
	PreparedStatement ps=con.prepareStatement("Insert into info values(?,?,?)");
	ps.setLong(1,2);
	ps.setString(2, "achin");
	ps.setString(3,"achin1234");
	int i= ps.executeUpdate();
	if(i>0) {
		System.out.println("sucessfully");
	}
	else {
		System.out.println("fail");
	}
	con.close();
}
}
