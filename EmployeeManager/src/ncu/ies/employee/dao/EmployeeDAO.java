package ncu.ies.employee.dao;

import ncu.ies.employee.domain.EmployeeEntity;

import java.util.List;

/**
 * 员工管理的DAO接口
 */
public interface EmployeeDAO {
	EmployeeEntity findById(int eid);

	EmployeeEntity findByUsername(EmployeeEntity employee);
	//EmployeeEntity findByUsername(String username);

	List<EmployeeEntity> findAll();

	void add(EmployeeEntity employee);

	void delete(EmployeeEntity employee);

	void update(EmployeeEntity employee);

}
