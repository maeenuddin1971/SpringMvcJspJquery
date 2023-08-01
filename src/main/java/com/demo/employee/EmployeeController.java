package com.demo.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/addEmp")
    public String addEmp() {
        return "AddEmployee";
    }

    @GetMapping("/getAllEmployee")
    public ResponseEntity<?> getAllEmployee() {
        List<Employee> employeeList = employeeService.getAllEmployee();
        return new ResponseEntity<>(employeeList, HttpStatus.OK);
    }

    @GetMapping("/getEmployeeById/{id}")
    public ResponseEntity<?> getEmployeeById(@PathVariable(name = "id") Long id) {
        Employee employee = employeeService.getEmployeeById(id);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @PutMapping("/updateEmployee")
    public ResponseEntity<?> updateEmployee(@RequestBody Employee employee) {
        employeeService.updateEmployee(employee);
        return new ResponseEntity<>("updated", HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmp(@PathVariable(name = "id") Long id) {
        employeeService.deleteEmoployee(id);
        return new ResponseEntity<>("deleted", HttpStatus.OK);
    }


}
