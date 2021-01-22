package com.example.dao;

import com.example.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Long> {

    @Query(value = "select * from employee where name like %?1%", nativeQuery = true)
    Page<Employee> findByNameLike(String name, Pageable pageRequest);
}
