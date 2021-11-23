package com.lrl.classdesign.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ClassRepositoryTest {
    @Autowired
    private ClassRepository classRepository;
    @Test
    void findAll(){
        System.out.println(classRepository.findAll());
    }

}