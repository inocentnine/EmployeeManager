package ncu.ies.employee.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import ncu.ies.employee.domain.EmployeeEntity;
import ncu.ies.employee.service.EmployeeService;
import org.apache.struts2.ServletActionContext;

import java.util.List;

public class EmployeeAction extends ActionSupport implements ModelDriven<EmployeeEntity> {
    private static final long serialVersionUID = 1L;
    //模型驱动
    private EmployeeEntity employee=new EmployeeEntity();
    public EmployeeEntity getModel(){
        return  employee;
    }

    //注入EmployeeService
    private EmployeeService employeeService;
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    //查询全部员工
    public String findAll(){
        List<EmployeeEntity> list=employeeService.findAll();
        ServletActionContext.getRequest().setAttribute("list", list);
        return "findAll";
    }

    //根据id查询员工
    public String findById(){
        int eid=employee.getEid();
        EmployeeEntity employeeEntity=employeeService.findById(eid);
        ServletActionContext.getRequest().setAttribute("employeeEntity", employeeEntity);
        return "findById";
    }

    public String findByUsername(){
//        String username=employee.getUsername();
//        EmployeeEntity employeeEntity=employeeService.findByUsername(username);
//        ServletActionContext.getRequest().setAttribute("employeeEntity", employeeEntity);
//        return "findByUsername";
        EmployeeEntity employeeEntity=employeeService.findByUsername(employee);
//        if(employeeEntity==null){
//            this.addActionError("请输入需要查找的员工名!");
//            return "fail";
//        }else{
            //ActionContext.getContext().getSession().put("employeeEntity",employeeEntity);
            ServletActionContext.getRequest().setAttribute("employeeEntity",employeeEntity);
            return "findByUsername";
        //}
    }

    public String searchPage(){
        return "searchPage";
    }

    public String addPage(){
        return "addPage";
    }

    //添加员工
    public String add(){
        employeeService.add(employee);
        return "add";
    }

    //删除员工
    public String delete(){
        //先查询
        int eid=employee.getEid();
        EmployeeEntity employeeEntity=employeeService.findById(eid);
        //再删除
        employeeService.delete(employeeEntity);
        return "delete";
    }

    //更新
    public String update(){
        employeeService.update(employee);
        return "update";
    }

    public String updatePage(){
        //int eid=employee.getEid();
        //EmployeeEntity employeeEntity=employeeService.findById(eid);
       // ServletActionContext.getRequest().setAttribute("employeeEntity",employeeEntity);
        return "updatePage";
    }
}
