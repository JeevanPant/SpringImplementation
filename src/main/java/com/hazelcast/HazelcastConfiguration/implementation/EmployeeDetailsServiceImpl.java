package com.hazelcast.HazelcastConfiguration.implementation;




import com.hazelcast.HazelcastConfiguration.Persistence.Employee;
import com.hazelcast.HazelcastConfiguration.Repo.EmployeeDetailsFetchRepository;
import com.hazelcast.HazelcastConfiguration.interfaces.EmployeeDetailsService;
import com.hazelcast.HazelcastConfiguration.model.EmployeeDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class EmployeeDetailsServiceImpl implements EmployeeDetailsService {
    @Autowired
    EmployeeDetailsFetchRepository employeeDetailsFetchRepository;
    List<EmployeeDetails> list= new ArrayList<>();
  @Cacheable("employees")
   public List<EmployeeDetails> getEmployeeDetails(){

      List<Employee> employees= employeeDetailsFetchRepository.findAll();
      employees.forEach(employee -> iterateTheList(employee));
      return list;
    }

    private void iterateTheList(Employee employee){
      EmployeeDetails employeeDetails= new EmployeeDetails();
      employeeDetails.setName(employee.getEmployeeName());
      employeeDetails.setEmpId(employee.getEmpId());
      employeeDetails.setAddress(employee.getAddress());
      employeeDetails.setCompanyName(employee.getCompanyName());
      this.list.add(employeeDetails);

    }


    public void saveOrInsertEmployeeDetails(EmployeeDetails employee1){

      Employee employee = new Employee();
      employee.setEmpId(employee1.getEmpId());
      employee.setAddress(employee1.getAddress());
      employee.setEmployeeName(employee1.getName());
      employee.setCompanyName(employee1.getName());

employeeDetailsFetchRepository.save(employee);

    }
}
