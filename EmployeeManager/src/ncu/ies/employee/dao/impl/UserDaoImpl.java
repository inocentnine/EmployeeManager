package ncu.ies.employee.dao.impl;

import ncu.ies.employee.dao.UserDAO;
import ncu.ies.employee.domain.UserEntity;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

public class UserDaoImpl extends HibernateDaoSupport implements UserDAO {
    //登录
    @SuppressWarnings("all")
    @Override
    public UserEntity login(UserEntity user) {
        //根据用户名密码查询
        List<UserEntity> list=(List<UserEntity>)this.getHibernateTemplate().find("from UserEntity where username=?0 and password=?1", user.getUsername(),user.getPassword());
        //返回userInfo对象
        if(list.size()>0){
            return list.get(0);
        }

        return null;
    }
    @Override
    public void update(UserEntity user){
        this.getHibernateTemplate().update(user);
    }

    @Override
    public UserEntity findByUsername(String username){
        return this.getHibernateTemplate().get(UserEntity.class,username);
    }
}
