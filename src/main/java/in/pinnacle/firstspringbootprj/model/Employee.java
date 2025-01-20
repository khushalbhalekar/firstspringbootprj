package in.pinnacle.firstspringbootprj.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// public class Employee {
//     private int empId;
//     private String empName;
//     private String empPhone;
//     private String empEmail;

//     public int getEmpId() {
//         return empId;
//     }
//     public void setEmpId(int empId) {
//         this.empId = empId;
//     }
//     public String getEmpName() {
//         return empName;
//     }
//     public void setEmpName(String empName) {
//         this.empName = empName;
//     }
//     public String getEmpPhone() {
//         return empPhone;
//     }
//     public void setEmpPhone(String empPhone) {
//         this.empPhone = empPhone;
//     }
//     public String getEmpEmail() {
//         return empEmail;
//     }
//     public void setEmpEmail(String empEmail) {
//         this.empEmail = empEmail;
//     }    
// }

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empId;
    private String empName;
    private String empPhone;
    private String empEmail;
}