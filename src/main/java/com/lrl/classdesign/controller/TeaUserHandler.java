package com.lrl.classdesign.controller;

import com.lrl.classdesign.entity.teacher_user;
import com.lrl.classdesign.repository.TeaUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teauser")
public class TeaUserHandler {
    @Autowired
    private TeaUserRepository teaUserRepository;

    @PostMapping("/save")
    public String save(@RequestBody teacher_user tea){
        teacher_user result = teaUserRepository.save(tea);
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
            result = teaUserRepository.findById(username).get().getPassword();
        }catch (Exception e){
        }finally {
            return result;
        }

    }
}
