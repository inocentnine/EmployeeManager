package ncu.ies.employee.service;

import ncu.ies.employee.domain.UserEntity;

public interface UserService {
    UserEntity login(UserEntity user);

    void update(UserEntity user);

    UserEntity findByUsername(String username);
}
