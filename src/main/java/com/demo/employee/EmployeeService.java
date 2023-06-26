package com.demo.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeDao employeeDao;

    public void addEmp(Employee employee) {
        employeeDao.addEmployee(employee);
    }

    public List<Employee> getAllEmployee() {
        return employeeDao.getAllListOfEmployee();
    }

    public Employee getEmployeeById(Long id) {
        return employeeDao.getEmployeeById(id);
    }

    public void updateEmployee(Employee employee) {
        employeeDao.updateEmployee(employee);
    }

    public void deleteEmoployee(Long id) {
        employeeDao.deleteEmp(id);
    }
}
