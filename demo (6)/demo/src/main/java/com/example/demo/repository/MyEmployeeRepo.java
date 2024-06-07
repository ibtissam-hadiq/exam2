package com.example.demo.repository;

import com.example.demo.entity.MyEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyEmployeeRepo extends JpaRepository<MyEmployee,Long> {
}
