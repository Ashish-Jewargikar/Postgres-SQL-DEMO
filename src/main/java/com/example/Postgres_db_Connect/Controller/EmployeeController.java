package com.example.Postgres_db_Connect.Controller;

import com.example.Postgres_db_Connect.Entity.Employee;
import com.example.Postgres_db_Connect.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/add")
    public String addEmployee(@RequestBody Employee employee){
        return  employeeService.addEmployeeDetail(employee);
    }

    @GetMapping("/getEmployee")
    public List<Employee> getEmployees(){
        return employeeService.getEmployee();
    }

    @GetMapping("/getEmployeeById")
    public Employee getEmployeeById(@RequestParam int id){
        return employeeService.getEmployeeById(id);
    }

    @DeleteMapping("/deleteEmployeeById")
    public String deleteEmployeeById(@RequestParam int id){
        return employeeService.deleteEmployeeById(id);
    }

    @GetMapping("/totalEmployees")
    public String totalNoOfEmployees(){
        return employeeService.totalNoOfEmployees();
    }

    @GetMapping("/getEmployeeByEmail")
    public List<Employee> getEmployeeByEmail(@RequestParam String email) {
        return employeeService.getEmployeeByEmail(email);
    }

    @GetMapping("/getEmployeeSalary")
    public List<Employee> getEmployeeBySalaru(@RequestParam double salary) {
        return employeeService.getEmployeeBySalary(salary);
    }
}
