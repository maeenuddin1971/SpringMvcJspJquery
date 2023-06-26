package com.demo.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeDao {

    @Autowired
    HibernateTemplate hibernateTemplate;

    // to save a employee
    public void addEmployee(Employee employee) {
        hibernateTemplate.save(employee);
    }

    // get All employee
    public List<Employee> getAllListOfEmployee() {
        return hibernateTemplate.loadAll(Employee.class);
    }

    // get Employee By ID
    public Employee getEmployeeById(Long id) {
        return hibernateTemplate.load(Employee.class, id);
    }

    // update Employee
    public void updateEmployee(Employee employee) {
        hibernateTemplate.update(employee);
    }

    // delete employee
    public void deleteEmp(Long id) {
        hibernateTemplate.delete(hibernateTemplate.load(Employee.class, id));
    }
}
