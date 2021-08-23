package com.ust.springboot;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	EmpRespository emprepo;
	
	@Override
	public List<Emp> getemployees() {
		// TODO Auto-generated method stub
		return emprepo.findAll();
	}

	@Override
	public void saveEmployee(Emp employee) {
		// TODO Auto-generated method stub
		this.emprepo.save(employee);
		
	}

	@Override
	public Emp getEmployeeById(long id) {
		Optional<Emp> optional = emprepo.findById(id);
		Emp employee = null;
		if (optional.isPresent()) {
			employee = optional.get();
		} else {
			throw new RuntimeException(" Employee not found for id :: " + id);
		}
		return employee;
	}

	@Override
	public void deleteEmployeeById(long id) {
		this.emprepo.deleteById(id);
		
	}

}
