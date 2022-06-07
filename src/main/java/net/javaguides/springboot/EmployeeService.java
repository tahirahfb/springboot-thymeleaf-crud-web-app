package net.javaguides.springboot;

import java.util.*;

import org.springframework.data.domain.Page;

public interface EmployeeService {
 List<Employee> getAllEmployees();
 void saveEmployee(Employee employee);

 Employee getEmployeeById(long id);
 void deleteEmployeeById(long id);

 Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);

}
