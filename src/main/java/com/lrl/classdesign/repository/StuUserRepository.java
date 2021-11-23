package com.lrl.classdesign.repository;

import com.lrl.classdesign.entity.student_user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StuUserRepository extends JpaRepository<student_user,String> {
}
