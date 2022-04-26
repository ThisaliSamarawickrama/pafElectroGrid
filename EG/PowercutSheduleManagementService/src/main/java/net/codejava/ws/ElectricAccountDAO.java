package net.codejava.ws;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ElectricAccountDAO {
	
	Connection dbconn = DBConnection.connectDB();
    public ArrayList<ElectricAccountModel> getUser() throws SQLException{
		
		ArrayList<ElectricAccountModel> data = new ArrayList<ElectricAccountModel>();
		
		String select = "select * from electricAccount";
		PreparedStatement ps = dbconn.prepareStatement(select);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			ElectricAccountModel model = new ElectricAccountModel();
			
			model.setDistrict(rs.getString("district")); // column name
			model.setProvince(rs.getString("province"));
			model.setDistrict(rs.getString("address")); // column name
			model.setProvince(rs.getString("fullName"));
			model.setDistrict(rs.getString("telephoneNumber")); // column name
			model.setProvince(rs.getString("NIC"));
			model.setDistrict(rs.getString("GridArea")); // column name
			model.setProvince(rs.getString("CurrentLineType"));
			data.add(model);
			
		}
		
		return data;
		
	}
    
    public ElectricAccountModel insertElectricAccount(ElectricAccountModel electricaccountModel) {
		String insert = "insert into electricAccount(district, province, address, fullName, telephoneNumber, NIC, GridArea, CurrentLineType) values(?,?,?,?,?,?,?,?) ";
		
		try {
			PreparedStatement ps = dbconn.prepareStatement(insert);
			ps.setString(1, electricaccountModel.getDistrict());
			ps.setString(2, electricaccountModel.getProvince());
			ps.setString(3, electricaccountModel.getAddress());
			ps.setString(4, electricaccountModel.getFullName());
			ps.setString(5, electricaccountModel.getTelephoneNumber());
			ps.setString(6, electricaccountModel.getNIC());
			ps.setString(7, electricaccountModel.getGridArea());
			ps.setString(8, electricaccountModel.getCurrentLineType());
			
			ps.execute();
		}catch(Exception e) {
			System.out.println(e +"data insert unsuccess.");
		}
		
		return electricaccountModel;
		
	}
    
    public ElectricAccountModel updatetElectricAccount(ElectricAccountModel electricaccountModel) {
		String update = "update electricAccount set district=? , province=?, address=?, fullName=?,  GridArea=?, CurrentLineType=? where telephoneNumber =?";
		
		try {
			PreparedStatement ps = dbconn.prepareStatement(update);
			ps.setString(1, electricaccountModel.getDistrict());
			ps.setString(2, electricaccountModel.getProvince());
			ps.setString(3, electricaccountModel.getAddress());
			ps.setString(4, electricaccountModel.getFullName());
			ps.setString(5, electricaccountModel.getGridArea());
			ps.setString(6, electricaccountModel.getCurrentLineType());
			ps.setString(7, electricaccountModel.getTelephoneNumber());
			
			ps.executeUpdate();
		}catch(Exception e) {
			System.out.println(e +"data update unsuccess.");
		}
		
		return electricaccountModel;
		
	}

	public int deletetPlan(int id) {
          String deletet = "delete from electricAccount where telephoneNumber =?";
		
		try {
			PreparedStatement ps = dbconn.prepareStatement(deletet);
			ps.setInt(1,id);
			
			ps.executeUpdate();
		}catch(Exception e) {
			System.out.println(e +"data deleting unsuccess.");
		}
		
		return id;
	}
	
	
	
	public ArrayList<ElectricAccountModel> getAccountById(int id) throws SQLException{
		
		ArrayList<ElectricAccountModel> data = new ArrayList<ElectricAccountModel>();
		String select = "select * from electricAccount where telephoneNumber =?";
		PreparedStatement ps = dbconn.prepareStatement(select);
		ps.setInt(1,id);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			ElectricAccountModel model = new ElectricAccountModel();
			
			model.setDistrict(rs.getString("district")); // column name
			model.setProvince(rs.getString("province"));
			model.setDistrict(rs.getString("address")); // column name
			model.setProvince(rs.getString("fullName"));
			model.setDistrict(rs.getString("telephoneNumber")); // column name
			model.setProvince(rs.getString("NIC"));
			model.setDistrict(rs.getString("GridArea")); // column name
			model.setProvince(rs.getString("CurrentLineType"));
			data.add(model);	
		}		
		return data;	
	}
	
}
