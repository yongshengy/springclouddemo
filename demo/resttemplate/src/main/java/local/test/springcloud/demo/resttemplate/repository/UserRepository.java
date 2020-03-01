package local.test.springcloud.demo.resttemplate.repository;

import local.test.springcloud.demo.resttemplate.entity.User;

import java.util.Collection;

public interface UserRepository {
    public Collection<User> findAll();
    public User findById(Long id);
    public void saveOrUpdate(User user);
    public void deleteById(Long id);
}
