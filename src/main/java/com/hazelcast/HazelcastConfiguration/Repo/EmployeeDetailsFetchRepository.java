package com.hazelcast.HazelcastConfiguration.Repo;


import com.hazelcast.HazelcastConfiguration.Persistence.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeDetailsFetchRepository extends JpaRepository<Employee,Integer> {


}
