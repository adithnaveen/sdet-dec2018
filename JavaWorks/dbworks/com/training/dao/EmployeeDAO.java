package com.training.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.training.connection.GetConnection;
import com.training.entity.Employee;
import com.training.standards.IEmployeeDAO;

public class EmployeeDAO implements IEmployeeDAO{

	@Override
	public boolean insertEmployee(Employee emp) {

		// arrays -0 
		// iterators - -1 
		// positional parameters  - 1
		try {
			String sql ="insert into employee values(?,?,?,?)";
			
			GetConnection gc = new GetConnection(); 
			gc.ps = GetConnection.getMySqlConnection().
					prepareStatement(sql);
			
			gc.ps.setInt(1, emp.getEmpId());
			gc.ps.setString(2, emp.getEmpName());
			gc.ps.setDouble(3, emp.getEmpSal());
			gc.ps.setString(4, emp.getEmpEmail());

			return gc.ps.executeUpdate()>0;
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return false;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		String sql ="delete from employee where empid =?"; 
		GetConnection gc = new GetConnection(); 
		
		try {
			gc.ps = GetConnection.getMySqlConnection().
					prepareStatement(sql);
			
			gc.ps.setInt(1, empId); 
			
			return gc.ps.executeUpdate()>0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return false;
	}

	@Override
	public boolean updateEmployeeSalary(int empId, 
				double newSalary) {

		String sql ="update employee set empsal = ? "
				+ "where empid = ?";
		GetConnection gc =null; 
		try {
			gc = new GetConnection();
			gc.ps = GetConnection.getMySqlConnection().
					prepareStatement(sql); 
			gc.ps.setDouble(1, newSalary);
			gc.ps.setInt(2, empId);
			
			return gc.ps.executeUpdate()>0;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				gc.ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		}
		
		return false;
	}

	@Override
	public Employee getEmployee(int empId) {
		String sql = "select empid, empname, empsal, "
				+ "empemail from employee where empid=?";
		
		GetConnection gc = new GetConnection(); 
		try {
			gc.ps = GetConnection.getMySqlConnection()
						.prepareStatement(sql);
			
			gc.ps.setInt(1, empId); 
			
			gc.rs = gc.ps.executeQuery(); 
			
			if(gc.rs.next()) {
				Employee employee = new Employee(); 
				employee.setEmpId(gc.rs.getInt(1));
				employee.setEmpName(gc.rs.getString(2));
				employee.setEmpSal(gc.rs.getDouble(3));
				employee.setEmpEmail(gc.rs.getString(4));
				
				return employee; 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				gc.ps.close(); 
				gc.rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		}
		return null;
	}

	@Override
	public List<Employee> getAllEmps() {
		String sql = "select empid, empname, "
				+ "empsal, empemail from employee";
		
		GetConnection gc = new GetConnection(); 
		List<Employee> empList = new ArrayList<Employee>(); 
		
		try {
			gc.ps = GetConnection.getMySqlConnection()
						.prepareStatement(sql); 
			
			// there might be more than 1 record 
			gc.rs = gc.ps.executeQuery(); 
			
			while(gc.rs.next()) {
				Employee employee = new Employee(); 
				employee.setEmpId(gc.rs.getInt(1));
				employee.setEmpName(gc.rs.getString(2));
				employee.setEmpSal(gc.rs.getDouble(3));
				employee.setEmpEmail(gc.rs.getString(4));
			
				empList.add(employee); 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return empList; 
		
	}

}
