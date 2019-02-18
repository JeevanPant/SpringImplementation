package com.hazelcast.HazelcastConfiguration.interfaces;


import com.hazelcast.HazelcastConfiguration.model.EmployeeDetails;

public interface EmployeeDetailsDao {
    public EmployeeDetails fetchEmployeeData();
    public void performInsertInDb(EmployeeDetails employeeDetails);
}
