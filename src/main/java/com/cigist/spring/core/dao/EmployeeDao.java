package com.cigist.spring.core.dao;

import com.cigist.spring.core.interfaces.EmployeIntf;
import com.cigist.spring.core.model.Employee;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by cigist on 13/02/19.
 */
public class EmployeeDao implements EmployeIntf {
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void insert(Employee _emp) {
    }

    @Override
    public Employee finyById(int _id) {
        Connection conn =null;
        try{
            conn = dataSource.getConnection();
            String SQL ="Select * from hr.employee WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(SQL);
            ps.setInt(1,_id);
            Employee emp = new Employee();
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                emp.setId(rs.getInt(1));
                emp.setFirstName(rs.getString(2));
                emp.setLastName(rs.getString(3));
            }

            rs.close();
            ps.close();

            return emp;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
