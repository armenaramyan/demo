package com.test.repository;

import com.test.model.DemoAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<DemoAddress, Integer> {

}
