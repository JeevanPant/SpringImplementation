package com.hazelcast.HazelcastConfiguration.implementation;

import com.hazelcast.HazelcastConfiguration.interfaces.EmployeeDetailsDao;
import com.hazelcast.HazelcastConfiguration.model.EmployeeDetails;
import org.springframework.stereotype.Repository;

@Repository

public class EmployeeDetailsDaoImpl implements EmployeeDetailsDao {
    @Override
    public EmployeeDetails fetchEmployeeData() {
        return null;
    }

    @Override
    public void performInsertInDb(EmployeeDetails employeeDetails) {

    }
}
