package edu.test;

import edu.dao.EmployeeDAO;
import edu.dto.EmployeeDTO;

public class Test {
	public static void main(String[] args)throws Exception {
		EmployeeDTO emp = new EmployeeDTO();
		emp.setEid("e101");
		emp.setEname("RAJU");
		emp.setSalary(25000);
		emp.setDeptno(20);
		System.out.println(EmployeeDAO.insertEmployee(emp));
	}
}
