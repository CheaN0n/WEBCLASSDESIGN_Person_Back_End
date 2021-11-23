package com.lrl.classdesign.controller;

import com.lrl.classdesign.entity.student_user;
import com.lrl.classdesign.repository.StuUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stuuser")
public class StuUserHandler {
    @Autowired
    private StuUserRepository stuuserRepository;

    @GetMapping("/findAll")
    public List<student_user> findAll(){
        return stuuserRepository.findAll();
    }

    @PostMapping("/save")
    public String save(@RequestBody student_user su){
        student_user result = stuuserRepository.save(su);
        if (result != null){
            return "success";
        }else{
            return "error";
        }
    }

    @GetMapping("/login/{id}")
    public String findpasswordByusername(@PathVariable("id") String username){
        String result = "error";
        try {
            result = stuuserRepository.findById(username).get().getPassword();
        }catch (Exception e){
        }finally {
            return result;
        }
    }

    @GetMapping("/details/{id}")
    public student_user finddetailsbyid(@PathVariable("id") String username){
        student_user stu = stuuserRepository.findById(username).get();
        return stu;
    }



}
