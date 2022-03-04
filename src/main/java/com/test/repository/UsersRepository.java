package com.test.repository;

import com.test.model.DemoUsers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsersRepository extends JpaRepository<DemoUsers, Integer> {

    List<DemoUsers> findAllByName(String name);//просто правильное название метода даст возможность
    //избежать запросов на SQL

    @Query("select u from DemoUsers u where u.email = :email")//если этого мало можно написать
        //собственный запрос на языке похожем на SQL
    DemoUsers findEmail(String email);

    @Query("select u from DemoUsers u where u.email like '%@gmail.com%'")//если этого мало можно написать
        //собственный запрос на языке похожем на SQL
    List<DemoUsers> findWhereEmailIsGmail();

    @Query("select u from DemoUsers u where u.id = :id")
    DemoUsers findById(int id);
}
