package com.cigist.spring.core.interfaces;

import com.cigist.spring.core.model.Employee;

/**
 * Created by cigist on 13/02/19.
 */
public interface EmployeIntf {
    public void insert(Employee _emp);
    public Employee finyById (int _id);
}
