package com.lrl.classdesign.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class StuUserRepositoryTest {
    @Autowired
    private StuUserRepository stuUserRepository;
//    @Test
//    void findAll(){
//        System.out.println(stuUserRepository.findAll());
//    }
//    @Test
//    void findpasswordByusername(){
//        System.out.println(stuUserRepository.findById("202000300113").get().getPassword());
//    }
//    @Test
//    void save2(){
//        stuUser s = new stuUser();
//        s.setName("芜香蛋");
//        s.setUsername("202000300137");
//        s.setPassword("123");
//        stuUser s2 = stuUserRepository.save(s);
//        System.out.println(s2);
//    }
}