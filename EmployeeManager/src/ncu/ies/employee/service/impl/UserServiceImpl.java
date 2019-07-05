package ncu.ies.employee.service.impl;

import ncu.ies.employee.dao.UserDAO;
import ncu.ies.employee.domain.UserEntity;
import ncu.ies.employee.service.UserService;

import javax.transaction.Transactional;

@Transactional
public class UserServiceImpl implements UserService {
    private UserDAO userDAO;

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public UserEntity login(UserEntity user){
        return userDAO.login(user);
    }

    public void update(UserEntity user){
        userDAO.update(user);
    }

    public UserEntity findByUsername(String username){
        return userDAO.findByUsername(username);
    }
}
