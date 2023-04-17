package com.example.Postgres_db_Connect.Service;

import com.example.Postgres_db_Connect.Entity.Employee;
import com.example.Postgres_db_Connect.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public String addEmployeeDetail(Employee employee) {
        employeeRepository.save(employee);
        return "employees details added";
    }
    public List<Employee> getEmployee(){
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(int id){
        return employeeRepository.findById(id).get();
    }

    public String deleteEmployeeById(int id){
        employeeRepository.deleteById(id);
        return " student with id " + id + " deleted ";
    }

    public String totalNoOfEmployees(){
        int count = employeeRepository.findAll().size();
        return "Total employees are "+ count;
    }

    public List<Employee> getEmployeeByEmail(String email) {
        return employeeRepository.findByEmail(email);
    }

    public List<Employee> getEmployeeBySalary(double salary) {
        return employeeRepository.findBySalary(salary);
    }

}
