package com.lrl.classdesign.repository;

import com.lrl.classdesign.entity.student_grade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradeRepository extends JpaRepository<student_grade,Integer> {
}
