package com.lrl.classdesign.controller;

import com.lrl.classdesign.entity.classchoice;
import com.lrl.classdesign.repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/classlist")
public class ClassListHandler {
    @Autowired
    private ClassRepository classRepository;

    @GetMapping("/findAll")
    public List<classchoice> findAll(){
        return classRepository.findAll();

    }

    @PostMapping("/save")
    public String save(@RequestBody classchoice cc){
        classchoice result = classRepository.save(cc);
        if (result != null){
            return "success";
        }else{
            return "error";
        }
    }

    @GetMapping("/findById/{id}")
    public classchoice findByCrousenumber(@PathVariable("id") String crousenumber){
        return classRepository.findById(crousenumber).get();
    }

    @PutMapping("/update")
    public String update(@RequestBody classchoice cc){
        classchoice result = classRepository.save(cc);
        if (result != null){
            return "success";
        }else{
            return "error";
        }
    }
    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") String crousenumber){
        classRepository.deleteById(crousenumber);
    }
}
