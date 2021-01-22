package com.example.service;

import com.example.dao.EmployeeDao;
import com.example.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class EmployeeService {

    @Resource
    private EmployeeDao employeeDao;

    public void save(Employee employee) {
        String now = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        employee.setCreateTime(now);
        employeeDao.save(employee);
    }

    public void delete(Long id) {
        employeeDao.deleteById(id);
    }

    public Employee findById(Long id) {
        return employeeDao.findById(id).orElse(null);
    }

    public List<Employee> findAll() {
        return employeeDao.findAll();
    }

    public Page<Employee> findPage(Integer pageNum, Integer pageSize, String name) {
        // 构建分页查询条件
        Sort sort = new Sort(Sort.Direction.DESC, "create_time");
        Pageable pageRequest = PageRequest.of(pageNum - 1, pageSize, sort);
        return employeeDao.findByNameLike(name, pageRequest);
    }
}
