package com.Sachin;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;

public class FetchDataFromJdbc {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		System.out.println("sucess");
		PreparedStatement ps1=con1.prepareStatement("select * from info ");
		ResultSet rs = ps1.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString("Name"));
			System.out.println(rs.getString("email"));
		}
		con1.close();
}
}
