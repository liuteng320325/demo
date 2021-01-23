package com.example.service;

import com.example.dao.EmployeeDao;
import com.example.entity.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeServiceTest {

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void save() {
        Employee employee = new Employee();
        String now = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        employee.setSex("Male");
        employee.setPhone("13090909000");
        employee.setAge(19);
        employee.setName("testname");
        employee.setAddress("addtest1");
        employee.setCreateTime(now);
        employeeDao.save(employee);
    }

    @Test
    public void delete() {
        Long id = 15l;
        employeeDao.deleteById(id);
    }

    @Test
    public void findById() {
        Employee employee =  employeeDao.findById(14l).orElse(null);
        System.out.println(employee.getName());
    }

    @Test
    public void findAll() {
        List<Employee> employees =  employeeDao.findAll();
        System.out.println(employees.size());
    }

    @Test
    public void findPage() {

        Sort sort = new Sort(Sort.Direction.DESC, "create_time");

        Pageable pageRequest = PageRequest.of(2, 2, sort);

        Page<Employee> employeePage =  employeeDao.findByNameLike("1", pageRequest);

        System.out.println(employeePage.iterator().next().getName());
    }
}