package com.leave.leaveReqB.controller;



import com.leave.leaveReqB.model.Employee;
import com.leave.leaveReqB.repository.EmployeeRepository;
import com.leave.leaveReqB.tools.BCrypt;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author AdhityaWP
 */
@Component
public class ProcessLogin {
    @Autowired
    EmployeeRepository employeeRepository;
    
    public boolean authUser(String id, String password ) {

        Optional<Employee> emp = employeeRepository.findById(id);

        if (employeeRepository.existsById(id) && BCrypt.checkpw(password, emp.get().getPassword())) {
             return true;
        }
        return false;

    }
}
