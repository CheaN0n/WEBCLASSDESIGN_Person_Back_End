package com.lrl.classdesign;

import com.lrl.classdesign.entity.classchoice;
import com.lrl.classdesign.repository.ClassRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ClassdesignApplicationTests {
    @Autowired
    private ClassRepository repository;


//    @Test
//    void save(){
//        classchoice classchoices = new classchoice();
//        classchoices.setCoursenumber("sd20005");
//        classchoices.setName("形势与政策");
//        classchoice classchoices2 = repository.save(classchoices);
//        System.out.println(classchoices2);
//    }
    @Test
    void findById(){
        classchoice Class = repository.findById("sd20001").get();
        System.out.println(Class);
    }

//    @Test
//    void update(){
//        classchoice classchoices = new classchoice();
//        classchoices.setName("形势与政策");
//        classchoice classchoices2 = repository.save(classchoices);
//        System.out.println(classchoices2);
//    }
//    @Test
//    void delete(){
//        repository.deleteById("sd2000");
//    }




}
