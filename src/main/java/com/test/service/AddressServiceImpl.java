package com.test.service;

import com.test.model.DemoAddress;
import com.test.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService{

    @Autowired
    AddressRepository addressRepository;

    @Override
    public void save(DemoAddress demoAddress) {
        addressRepository.save(demoAddress);
    }
}
