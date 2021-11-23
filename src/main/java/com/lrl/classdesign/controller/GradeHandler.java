package com.lrl.classdesign.controller;

import com.lrl.classdesign.entity.student_grade;
import com.lrl.classdesign.repository.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/grade")
public class GradeHandler {
    @Autowired
    private GradeRepository gradeRepository;

    @PostMapping("/choose")
    public String save(@RequestBody student_grade sg){
        List<student_grade> stugrades;
        stugrades = gradeRepository.findAll();
        for (student_grade s : stugrades){
            if (s.getCoursenumber().equals(sg.getCoursenumber())&&s.getUsername().equals(sg.getUsername())){
                return "repeat";
            }
        }
        for (student_grade s : stugrades){
            if (s.getTimeandplace().substring(0,14).equals(sg.getTimeandplace().substring(0,14))&&s.getUsername().equals(sg.getUsername())){
                return "conflict";
            }
        }
        student_grade result = gradeRepository.save(sg);
        if (result != null){
            return "success";
        }else{
            return "error";
        }
    }

    @GetMapping("/find/{username}")
    public List<student_grade> findmyclass(@PathVariable("username") String username){
        List<student_grade> stugrades;
        List<student_grade> results = new LinkedList<student_grade>();
        stugrades = gradeRepository.findAll();
        for (student_grade s : stugrades){
            if (s.getUsername().equals(username)){
                results.add(s);
            }
        }
        return results;
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Integer id){
        gradeRepository.deleteById(id);
    }

    //通过课程名获得选课的记录进而获取学生名单
    @GetMapping("/getlist/{classname}")
    public List<student_grade> getlistbyclassname(@PathVariable("classname") String classname){
        List<student_grade> stugrades;
        List<student_grade> results = new LinkedList<student_grade>();
        stugrades = gradeRepository.findAll();
        for (student_grade s : stugrades){
            if (s.getName().equals(classname)){
                results.add(s);
            }
        }
        return results;
    }

    @PostMapping("/savegrade")
    public String savegrade(@RequestBody student_grade sg){
        student_grade result = gradeRepository.save(sg);
        if (result != null){
            return "success";
        }else{
            return "error";
        }
    }

    @GetMapping("/checkgrade/{username}")
    public List<student_grade> checkgrade(@PathVariable("username") String username){
        List<student_grade> stugrades;
        List<student_grade> results = new LinkedList<student_grade>();
        stugrades = gradeRepository.findAll();
        for (student_grade s : stugrades){
            if (s.getUsername().equals(username)){
                results.add(s);
            }
        }
        return results;
    }
    @GetMapping("/getave/{username}")
    public List<Integer> getave(@PathVariable("username") String username){
        List<student_grade> stugrades;
        List<String> selectedclassid = new LinkedList<String>();
        List<Integer> averages = new LinkedList<Integer>();
        double sum = 0;
        int index = 0;
        stugrades = gradeRepository.findAll();
        for (student_grade s : stugrades){
            if (s.getUsername().equals(username)){
                selectedclassid.add(s.getCoursenumber());
            }
        }
        for(String classnameid : selectedclassid){
            for (student_grade s : stugrades){
                if (s.getCoursenumber().equals(classnameid)){
                    index++;
                    sum+=Double.parseDouble(s.getClassgrade());
                }
            }

            averages.add((int)sum/index);
            index = 0;
            sum = 0;
        }
        return averages;
    }
}
