package local.test.orderingsystem.user.repository;

import local.test.orderingsystem.user.entity.User;

import java.util.List;

public interface UserRepository {
    public List<User> findAll(int index, int limit);
    public int count();
    public void save(User user);
    public void deleteById(long id);
}
