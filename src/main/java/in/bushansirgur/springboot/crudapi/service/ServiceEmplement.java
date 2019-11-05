package in.bushansirgur.springboot.crudapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.bushansirgur.springboot.crudapi.dao.EmployeeDAO;
import in.bushansirgur.springboot.crudapi.model.Employee;

@Service
public class ServiceEmplement implements EmployeeService {

	@Autowired
	private EmployeeDAO employeedao;

	@Override
	public List<Employee> get() {
		// TODO Auto-generated method stub
		return employeedao.findAll();
	}

	@Override
	public Employee get(int id) {
		Optional<Employee> employee = employeedao.findById(id);
		if (employee.isPresent()) {
	        return employee.get();

		}
		return null;

	}

	@Override
	public void save(Employee employee) {
		
		employeedao.save(employee);
	}

	
	@Override
	public void delete(int id) { 
		employeedao.deleteById(id);
	}
}
