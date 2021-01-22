package com.example.controller;

import com.example.common.Result;
import com.example.entity.Employee;
import com.example.service.EmployeeService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Resource
    private EmployeeService employeeService;

    // 新增employee
    @PostMapping
    public Result add(@RequestBody Employee employee) {
        employeeService.save(employee);
        return Result.success();
    }

    // 修改用户
    @PutMapping
    public Result update(@RequestBody Employee employee) {
        employeeService.save(employee);
        return Result.success();
    }

    // 删除用户
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        employeeService.delete(id);
    }

    // 根据id查询用户
    @GetMapping("/{id}")
    public Result<Employee> findById(@PathVariable Long id) {
        return Result.success(employeeService.findById(id));
    }

    // 查询所有
    @GetMapping("/findAll")
    public Result<List<Employee>> findAll() {
        return Result.success(employeeService.findAll());
    }

    // 分页查询
    @GetMapping("/page")
    public Result<Page<Employee>> findPage(@RequestParam(defaultValue = "1") Integer pageNum,
                                       @RequestParam(defaultValue = "10") Integer pageSize,
                                       @RequestParam(required = false) String name) {
        return Result.success(employeeService.findPage(pageNum, pageSize, name));
    }

}
