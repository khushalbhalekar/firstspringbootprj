package in.pinnacle.firstspringbootprj.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import in.pinnacle.firstspringbootprj.model.Employee;
import in.pinnacle.firstspringbootprj.service.EmployeeService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

// @RestController
// public class EmployeeController {

//     List<Employee> empList = new ArrayList<>();

//     @PostMapping("/employee")
//     public String createEmployee(@RequestBody Employee employee) {
//         // TODO: process POST request
//         empList.add(employee);
//         return "employee created successfully";
//     }

//     @GetMapping("employee")
//     public List<Employee> showEmployee() {
//         return empList;
//     }

//     @PutMapping("employee/{id}")
//     public String updateEmployee(@PathVariable String id, @RequestBody Employee employee) {
//         // TODO: process PUT request
//         if (empList.size() > 0) {
//             for (int i = 0; i < empList.size(); i++) {
//                 Employee emp = empList.get(i);
//                 if (emp.getEmpId() == Integer.parseInt(id)) {
//                     emp.setEmpName(employee.getEmpName());
//                     emp.setEmpEmail(employee.getEmpEmail());
//                     emp.setEmpPhone(employee.getEmpPhone());
//                 }

//                 // else{
//                 // return "no employee found";
//                 // }
//             }
//         } else {
//             return "no employee records";
//         }
//         // return entity;
//         return "employee updated successfully";
//     }

//     @DeleteMapping("employee/{id}")
//     public String deleteEmployee(@PathVariable String id) {
//         if(empList.size()>0){
//             // for(Employee employee : empList){
//             //     if(employee.getEmpId() == Integer.parseInt(id)){
//             //         empList.remove(employee);
//             //     }
//             // }

//             for (int i = 0; i < empList.size(); i++) {
//                 Employee emp = empList.get(i);
//                 if (emp.getEmpId() == Integer.parseInt(id)) {
//                     empList.remove(i);
//                 }
//             }
//         }else{
//             return "no employee record";
//         }
//         return "employee deleted successfully";

//     }

// }


@RestController
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    // @Autowired
    // private EmployeeService employeeService;

    @PostMapping("/employee")
    public String createEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
        // TODO: process POST request

    }

    @GetMapping("employee")
    public List<Employee> showEmployee() {
        return employeeService.showEmployee();
    }

    // @PutMapping("employee/{id}")
    // public String updateEmployee(@PathVariable String id, @RequestBody Employee employee) {
    //     // TODO: process PUT request
    //     return employeeService.updateEmployee(id, employee);
    // }

    // @DeleteMapping("employee/{id}")
    // public String deleteEmployee(@PathVariable String id) {
    //     return employeeService.deleteEmployee(id);
    // }

}