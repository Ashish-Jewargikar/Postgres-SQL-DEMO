package com.example.Postgres_db_Connect.Repository;

import com.example.Postgres_db_Connect.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    List<Employee> findByEmail(String branch);

    List<Employee> findBySalary(double salary);
}
