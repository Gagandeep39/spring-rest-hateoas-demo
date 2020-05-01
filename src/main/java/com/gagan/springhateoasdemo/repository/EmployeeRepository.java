/**
 * @author Gagandeep Singh
 * @email singh.gagandeep3911@gmail.com
 * @create date 2020-05-01 03:36:19
 * @modify date 2020-05-01 03:36:19
 * @desc [description]
 */
package com.gagan.springhateoasdemo.repository;

import com.gagan.springhateoasdemo.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}