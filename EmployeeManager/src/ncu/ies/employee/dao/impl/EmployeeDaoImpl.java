package ncu.ies.employee.dao.impl;

import ncu.ies.employee.dao.EmployeeDAO;
import ncu.ies.employee.domain.EmployeeEntity;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

public class EmployeeDaoImpl extends HibernateDaoSupport implements EmployeeDAO {

    public EmployeeEntity findById(int eid){
        return this.getHibernateTemplate().get(EmployeeEntity.class,eid);
    }

    public EmployeeEntity findByUsername(EmployeeEntity employee){
        List<EmployeeEntity> list =(List<EmployeeEntity>) this.getHibernateTemplate().find("from EmployeeEntity where ename=?0 and username=?1", employee.getEname(),employee.getUsername());
        if (list.size() > 0) {
            return list.get(0);
        }
        return null;
    }
//    public EmployeeEntity findByUsername(String username){
//        return this.getHibernateTemplate().get(EmployeeEntity.class,username);
//    }

    public List<EmployeeEntity> findAll(){
        return (List<EmployeeEntity>) this.getHibernateTemplate().find("from EmployeeEntity ");
    }

    public void add(EmployeeEntity employee){
        this.getHibernateTemplate().save(employee);
//        getHibernateTemplate().execute(new HibernateCallback<EmployeeEntity>() {
//            @Override
//            public EmployeeEntity doInHibernate(Session session) throws HibernateException {
//                session.save(employee);
//                return null;
//            }
//        });

    }

    public void delete(EmployeeEntity employee){
        this.getHibernateTemplate().delete(employee);
//        getHibernateTemplate().execute(new HibernateCallback<EmployeeEntity>() {
//            @Override
//            public EmployeeEntity doInHibernate(Session session) throws HibernateException {
//                session.delete(employee);
//                return null;
//            }
//        });
    }

    public void update(EmployeeEntity employee){
        this.getHibernateTemplate().update(employee);
//        getHibernateTemplate().execute(new HibernateCallback<EmployeeEntity>() {
//            @Override
//            public EmployeeEntity doInHibernate(Session session) throws HibernateException {
//                session.update(employee);
//                return null;
//            }
//        });
    }
}
