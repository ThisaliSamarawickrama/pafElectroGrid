package net.codejava.ws;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;


public class PowercutDAO {
	
	 Connection dbconn = DBConnection.connectDB();
    public ArrayList<Powercutmodel> getUser() throws SQLException{
		
		ArrayList<Powercutmodel> data = new ArrayList<Powercutmodel>();
		
		String select = "select * from powercut";
		PreparedStatement ps = dbconn.prepareStatement(select);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			Powercutmodel model = new Powercutmodel();
			
			model.setDistrict(rs.getString("district")); // column name
			model.setProvince(rs.getString("province"));
			model.setDistrict(rs.getString("grid_Area")); // column name
			model.setProvince(rs.getString("monday"));
			model.setDistrict(rs.getString("tuesday")); // column name
			model.setProvince(rs.getString("wednesday"));
			model.setDistrict(rs.getString("thursday")); // column name
			model.setProvince(rs.getString("friday"));
			model.setDistrict(rs.getString("saturday")); // column name
			model.setProvince(rs.getString("sunday"));
			data.add(model);
			
		}
		
		return data;
		
	}
    
    public Powercutmodel insertPlan(Powercutmodel powercut) {
		String insert = "insert into powercut(district, province, grid_Area, monday, tuesday, wednesday, thursday, friday, saturday, sunday) values(?,?,?,?,?,?,?,?,?,?) ";
		
		try {
			PreparedStatement ps = dbconn.prepareStatement(insert);
			ps.setString(1, powercut.getDistrict());
			ps.setString(2, powercut.getProvince());
			ps.setString(3, powercut.getGrid_Area());
			ps.setString(4, powercut.getMonday());
			ps.setString(5, powercut.getTuesday());
			ps.setString(6, powercut.getWednesday());
			ps.setString(7, powercut.getThursday());
			ps.setString(8, powercut.getFriday());
			ps.setString(9, powercut.getSaturday());
			ps.setString(10, powercut.getSunday());
			
			ps.execute();
		}catch(Exception e) {
			System.out.println(e +"data insert unsuccess.");
		}
		
		return powercut;
		
	}
    
    public Powercutmodel updatetpowercut(Powercutmodel powercut) {
		String update = "update powercut set monday=? , tuesday=?, wednesday=?, thursday=?, friday=?, saturday=?, sunday=? where id =?";
		
		try {
			PreparedStatement ps = dbconn.prepareStatement(update);
			ps.setString(1, powercut.getMonday());
			ps.setString(2, powercut.getTuesday());
			ps.setString(3, powercut.getWednesday());
			ps.setString(4, powercut.getThursday());
			ps.setString(5, powercut.getFriday());
			ps.setString(6, powercut.getSaturday());
			ps.setString(7, powercut.getSunday());
			ps.setString(8, powercut.getGrid_Area());
			
			ps.executeUpdate();
		}catch(Exception e) {
			System.out.println(e +"data insert unsuccess.");
		}
		
		return powercut;
		
	}

	public int deletetPlan(int id) {
          String deletet = "delete from person where id =?";
		
		try {
			PreparedStatement ps = dbconn.prepareStatement(deletet);
			ps.setInt(1,id);
			
			ps.executeUpdate();
		}catch(Exception e) {
			System.out.println(e +"data deleting unsuccess.");
		}
		
		return id;
	}
	
	
	
	public ArrayList<Powercutmodel> getPlanById(int id) throws SQLException{
		
		ArrayList<Powercutmodel> data = new ArrayList<Powercutmodel>();
		String select = "select * from person where id =?";
		PreparedStatement ps = dbconn.prepareStatement(select);
		ps.setInt(1,id);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			Powercutmodel model = new Powercutmodel();
			
			model.setDistrict(rs.getString("district")); // column name
			model.setProvince(rs.getString("province"));
			model.setDistrict(rs.getString("grid_Area")); // column name
			model.setProvince(rs.getString("monday"));
			model.setDistrict(rs.getString("tuesday")); // column name
			model.setProvince(rs.getString("wednesday"));
			model.setDistrict(rs.getString("thursday")); // column name
			model.setProvince(rs.getString("friday"));
			model.setDistrict(rs.getString("saturday")); // column name
			model.setProvince(rs.getString("sunday"));		
			data.add(model);		
		}		
		return data;	
	}
	
}
