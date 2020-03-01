package local.test.orderingsystem.account.repository;

import local.test.orderingsystem.account.entity.Admin;

public interface AdminRepository {
    public Admin login(String username,String password);
}
