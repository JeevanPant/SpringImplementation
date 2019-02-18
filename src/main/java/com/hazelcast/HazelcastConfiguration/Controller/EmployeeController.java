package com.hazelcast.HazelcastConfiguration.Controller;


import com.hazelcast.HazelcastConfiguration.implementation.EmployeeDetailsServiceImpl;
import com.hazelcast.HazelcastConfiguration.model.EmployeeDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
    @Autowired
    EmployeeDetailsServiceImpl employeeDetailsService;

    @GetMapping("/employeeDetails")
    public ResponseEntity<List<EmployeeDetails>> getEmployeeDetails(){
    return  new ResponseEntity<List<EmployeeDetails>>(this.employeeDetailsService.getEmployeeDetails(),HttpStatus.OK);
    }
    @PostMapping("/saveEmployeeDetails")
    public void saveEmployeeDetails(@RequestBody EmployeeDetails employeeDetails){
        employeeDetailsService.saveOrInsertEmployeeDetails(employeeDetails);
    }





}
