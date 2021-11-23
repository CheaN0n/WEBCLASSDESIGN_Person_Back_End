package com.lrl.classdesign.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TeaUserRepositoryTest {
    @Autowired
    private TeaUserRepository teaUserRepository;

//    @Test
//    void save2(){
//        teaUser t = new teaUser();
//        t.setUsername("2020001");
//        t.setPassword("456");
//        teaUser t2 = teaUserRepository.save(t);
//        System.out.println(t2);
//    }

}