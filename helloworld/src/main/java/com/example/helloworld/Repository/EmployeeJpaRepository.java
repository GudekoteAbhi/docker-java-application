package com.example.helloworld.Repository;

import com.example.helloworld.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeJpaRepository extends JpaRepository<Employee, Long> {

    public Employee findByContact(String contact);
}
