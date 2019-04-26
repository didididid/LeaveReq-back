/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leave.leaveReqB.repository;


import com.leave.leaveReqB.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author AdhityaWP
 */
public interface EmployeeRepository extends JpaRepository<Employee, String>{
    
    
}