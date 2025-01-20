package in.pinnacle.firstspringbootprj.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.pinnacle.firstspringbootprj.model.Employee;
import in.pinnacle.firstspringbootprj.repository.EmployeeRepository;

// @Service
// public class EmployeeService {
//     List<Employee> empList = new ArrayList<>();

//     public String addEmployee(Employee employee) {
//         empList.add(employee);
//         return "employee created successfully";
//     }

//     public List<Employee> showEmployee() {
//         return empList;
//     }

//     public String updateEmployee(String id, Employee employee) {
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

//     public String deleteEmployee(String id) {
//         if (empList.size() > 0) {
//             // for (Employee employee : empList) {
//             // if (employee.getEmpId() == Integer.parseInt(id)) {
//             // empList.remove(employee);
//             // }
//             // }

//             for (int i = 0; i < empList.size(); i++) {
//                 Employee emp = empList.get(i);
//                 if (emp.getEmpId() == Integer.parseInt(id)) {
//                     empList.remove(i);
//                 }
//             }
//         } else {
//             return "no employee record";
//         }
//         return "employee deleted successfully";
//     }
// }

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // public EmployeeService(EmployeeRepository employeeRepository) {
    // this.employeeRepository = employeeRepository;
    // }

    public String addEmployee(Employee employee) {
        employeeRepository.save(employee);
        return "employee created successfully";
    }

    public List<Employee> showEmployee() {
        return employeeRepository.findAll();
    }

    public String updateEmployee(String id, Employee employee){
        //.save
    }

    public String deleteEmployee(String id){
        //.delete
    }
}