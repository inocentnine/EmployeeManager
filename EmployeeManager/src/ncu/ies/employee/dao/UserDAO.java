package ncu.ies.employee.dao;

import ncu.ies.employee.domain.UserEntity;

public interface UserDAO {
    UserEntity login(UserEntity user);

    void update(UserEntity user);

    UserEntity findByUsername(String username);
}
