package edu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import edu.dto.EmployeeDTO;
import edu.util.DBUtil;

public class EmployeeDAO {
	public static boolean insertEmployee(EmployeeDTO emp)throws Exception{
		Connection con = DBUtil.connect();
		String query = "INSERT INTO Employee VALUES(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, emp.getEid());
		ps.setString(2, emp.getEname());
		ps.setDouble(3,emp.getSalary());
		ps.setInt(4, emp.getDeptno());
		
		return ps.executeUpdate()==1;
	}
	/*
	  deleteEmployee()
	  updateEmployee()
	  selectEmployee()
	  selectAllEmployee()
	 
	 */
}
