package in.bushansirgur.springboot.crudapi.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import in.bushansirgur.springboot.crudapi.model.Employee;

public interface EmployeeDAO extends JpaRepository<Employee, Integer>{
	
}
