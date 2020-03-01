package local.test.orderingsystem.menu.repository;

import local.test.orderingsystem.menu.entity.Type;

import java.util.List;

public interface TypeRepository {
    public List<Type> findAll();
}
