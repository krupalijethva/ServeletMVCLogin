package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.Response;

import vo.regvo;

public class all_operation {
	public List loginsearch(regvo rv) {
		List ls = new ArrayList();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mvc", "root", "root");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from table1 where uname='"+rv.getUname()+"' and pwd='"+rv.getPwd()+"'");
			while(rs.next())
			{
				regvo regvo = new regvo();
				regvo.setId(rs.getInt("id"));
				regvo.setFname(rs.getString("fname"));
				regvo.setLname(rs.getString("lname"));
				regvo.setPwd(rs.getString("pwd"));
				regvo.setUname(rs.getString("uname"));
				ls.add(regvo);
			}
		} 
		catch (Exception e1) {
			System.out.println(e1);
		}
		return ls;
	}
	public void pwdchang(regvo rv) {
				try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mvc", "root", "root");
			Statement stmt = con.createStatement();
			stmt.executeUpdate("update table1 set pwd='"+rv.getNpwd()+"' where id='"+rv.getId()+"' ");
			} 
		catch (Exception e1) {
			System.out.println(e1);
		}
		}
	public void insert(regvo rv)
	{
		try
	    {
	    	Class.forName("com.mysql.jdbc.Driver");
	    	Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mvc","root","root");
	    	Statement stmt= con.createStatement();
	    	
	    	stmt.executeUpdate("insert into table1(fname,lname,uname,pwd,address,city) values('"+rv.getFname()+"','"+rv.getLname()+"','"+rv.getUname()+"','"+rv.getPwd()+"','"+rv.getAddress()+"','"+rv.getCity()+"')");
	}
	    catch(Exception e1)
	    {	
	    	System.out.println(e1);
	    }
	}
	public List searchdb() {
		List ls = new ArrayList();
			try 
			{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mvc", "root", "root");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from dbmvc");
		
			while (rs.next()) {
			
				regvo regvo = new regvo();
				regvo.setId(rs.getInt("id"));
				regvo.setFname(rs.getString("fname"));
				regvo.setLname(rs.getString("lname"));
				ls.add(regvo);
			}
			
		} 
		catch (Exception e1) {
			System.out.println(e1);
		}
		return ls;
	}

	

}
