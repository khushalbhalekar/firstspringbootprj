package in.pinnacle.firstspringbootprj.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pinnacle.firstspringbootprj.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    
}
