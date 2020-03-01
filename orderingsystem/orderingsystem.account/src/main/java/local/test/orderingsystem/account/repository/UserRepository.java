package local.test.orderingsystem.account.repository;

import local.test.orderingsystem.account.entity.User;

public interface UserRepository {
    public User login(String username,String password);
}
