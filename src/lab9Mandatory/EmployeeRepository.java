package lab9Mandatory;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
	 Department dep=new Department();

	 void createEmployee(int employeeId, String firstName, String lastName, String email, String phoneNumber,
				LocalDate hireDate, String designation, Double salary, int managerId, Department department)
	 {
		 Employee emp=new Employee( employeeId,firstName, lastName, email, phoneNumber,
					hireDate, designation, salary, managerId, department);
		 List<Employee> em=new ArrayList<>();
		 em.add(emp);
		 
		 
		 
	 }
}
