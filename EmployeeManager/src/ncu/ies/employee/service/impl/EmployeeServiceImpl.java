package ncu.ies.employee.service.impl;

import ncu.ies.employee.dao.EmployeeDAO;
import ncu.ies.employee.domain.EmployeeEntity;
import ncu.ies.employee.service.EmployeeService;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    //注入dao
    private EmployeeDAO employeeDAO;

    public void setEmployeeDAO(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    public EmployeeEntity findById(int eid){
        return employeeDAO.findById(eid);
    }

    public EmployeeEntity findByUsername(EmployeeEntity employee){
        return employeeDAO.findByUsername(employee);
    }

//    public EmployeeEntity findByUsername(String username){
//        return employeeDAO.findByUsername(username);
//    }

    public List<EmployeeEntity> findAll() {
        return employeeDAO.findAll();
    }

    public void add(EmployeeEntity employee){
        employeeDAO.add(employee);
    }

    public void delete(EmployeeEntity employee){
        employeeDAO.delete(employee);
    }

    public void update(EmployeeEntity employee){
        employeeDAO.update(employee);
    }
}
