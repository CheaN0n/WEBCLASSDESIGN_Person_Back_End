package com.lrl.classdesign.repository;

import com.lrl.classdesign.entity.teacher_user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeaUserRepository extends JpaRepository<teacher_user,String> {
}
