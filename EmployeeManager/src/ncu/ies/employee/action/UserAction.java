package ncu.ies.employee.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import ncu.ies.employee.domain.UserEntity;
import ncu.ies.employee.service.UserService;
import org.apache.struts2.ServletActionContext;

public class UserAction extends ActionSupport implements ModelDriven<UserEntity> {
    //注入service
    private UserService userService;
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    //模型驱动
    private UserEntity user=new UserEntity();
    public UserEntity getModel(){
        return user;
    }

    public String login(){
        UserEntity u=userService.login(user);
        if(u !=null){//成功
            //使用session保持登录状态
            ServletActionContext.getRequest().getSession().setAttribute("u", u);
//			ActionContext.getContext().getSession().put("u", u);
            return "loginsuccess";
        }else{
            this.addActionError("用户名或密码错误");
            return "loginfail";
        }
    }

    public String updatePasswordPage(){
        //String username=user.getUsername();
        //UserEntity userEntity=userService.findByUsername(username);
        //ServletActionContext.getRequest().setAttribute("userEntity",userEntity);
        return "updatePasswordPage";
    }

    public String updatePassword(){
        userService.update(user);
        return "updatePassword";
    }
}
