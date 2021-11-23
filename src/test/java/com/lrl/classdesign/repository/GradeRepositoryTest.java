package com.lrl.classdesign.repository;

import com.lrl.classdesign.entity.student_grade;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.LinkedList;
import java.util.List;

@SpringBootTest
class GradeRepositoryTest {
    @Autowired
    private GradeRepository gradeRepository;

//    @Test
//    void save2(){
//        student_grade sg = new student_grade();
//        sg.setUsername("1");
//        student_grade sg2 = gradeRepository.save(sg);
//        System.out.println(sg2);
//    }
//
//    @Test
//    void find(){
//        String username = "202000300113";
//        List<student_grade> stugrades;
//        List<student_grade> results = new LinkedList<student_grade>();
//        stugrades = gradeRepository.findAll();
//        for (student_grade s : stugrades){
//            if (s.getUsername().equals(username)){
//                results.add(s);
//            }
//        }
//        for (student_grade s : results){
//            System.out.println(s);
//        }
//
//    }
//    @Test
//    void getave(){
//        String username = "202000300113";
//        List<student_grade> stugrades;
//        List<String> selectedclassid = new LinkedList<String>();
//        List<Integer> averages = new LinkedList<Integer>();
//        double sum = 0;
//        int index = 0;
//        stugrades = gradeRepository.findAll();
//        for (student_grade s : stugrades){
//            if (s.getUsername().equals(username)){
//                selectedclassid.add(s.getCoursenumber());
//            }
//        }
//        for(String classnameid : selectedclassid){
////            System.out.println(classnameid);
//            for (student_grade s : stugrades){
//                if (s.getCoursenumber().equals(classnameid)){
//                    index++;
//                    sum+=Double.parseDouble(s.getClassgrade());
//                }
//            }
//
//            averages.add((int)sum/index);
//            index = 0;
//            sum = 0;
//        }
//        System.out.println(averages);
//    }

}