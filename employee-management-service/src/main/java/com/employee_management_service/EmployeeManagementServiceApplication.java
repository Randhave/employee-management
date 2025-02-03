package com.employee_management_service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeManagementServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeManagementServiceApplication.class, args);
        System.out.println("employee-management-service running...");
    }

}
