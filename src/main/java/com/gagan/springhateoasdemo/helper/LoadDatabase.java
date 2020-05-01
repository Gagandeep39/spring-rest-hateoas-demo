/**
 * @author Gagandeep Singh
 * @email singh.gagandeep3911@gmail.com
 * @create date 2020-05-01 03:38:01
 * @modify date 2020-05-01 03:38:01
 * @desc [description]
 */
package com.gagan.springhateoasdemo.helper;

import com.gagan.springhateoasdemo.model.Employee;
import com.gagan.springhateoasdemo.repository.EmployeeRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class LoadDatabase {

    CommandLineRunner initatabase(EmployeeRepository employeeRepository){
        return args -> {
            log.info("preloading: " + employeeRepository.save(new Employee("Gagandeep", "Manager")));
            log.info("preloading: " + employeeRepository.save(new Employee("Bobby", "Admin")));
        };
    }
    
}