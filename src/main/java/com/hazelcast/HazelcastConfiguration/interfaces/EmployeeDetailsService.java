package com.hazelcast.HazelcastConfiguration.interfaces;



import com.hazelcast.HazelcastConfiguration.model.EmployeeDetails;

import java.util.List;

public interface EmployeeDetailsService {
    public List<EmployeeDetails> getEmployeeDetails();
    public  void  saveOrInsertEmployeeDetails(EmployeeDetails employeeDetails);
}
