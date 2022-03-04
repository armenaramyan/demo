package com.test.service;

import com.test.model.DemoUsers;

import java.util.List;
import java.util.Optional;

public interface UsersService {

    void createUsers(DemoUsers users);

    List<DemoUsers> findAll();

    DemoUsers findById(int id);

    List<DemoUsers> findAllByName(String name);

    DemoUsers findEmail(String email);

    List<DemoUsers> findWhereEmailIsGmail();
}
