package ncu.ies.employee.service;

import ncu.ies.employee.domain.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    EmployeeEntity findById(int eid);

    EmployeeEntity findByUsername(EmployeeEntity employee);
    //EmployeeEntity findByUsername(String username);

    List<EmployeeEntity> findAll();

    void add(EmployeeEntity employee);

    void delete(EmployeeEntity employee);

    void update(EmployeeEntity employee);
}
