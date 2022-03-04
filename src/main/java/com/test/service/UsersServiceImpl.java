package com.test.service;

import com.test.model.DemoUsers;
import com.test.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService{

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private AddressService addressService;

    @Override
    public void createUsers(DemoUsers users) {
        addressService.save(users.getDemoAddress());
        usersRepository.save(users);
    }

    @Override
    public List<DemoUsers> findAll() {
        return usersRepository.findAll();
    }

    @Override
    public DemoUsers findById(int id) {
        return usersRepository.findById(id);
    }

    @Override
    public List<DemoUsers> findAllByName(String name) {
        return null;
    }

    @Override
    public DemoUsers findEmail(String email) {
        return null;
    }

    @Override
    public List<DemoUsers> findWhereEmailIsGmail() {
        return null;
    }
}
