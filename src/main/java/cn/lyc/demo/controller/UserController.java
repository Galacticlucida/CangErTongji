package cn.lyc.demo.controller;

import cn.lyc.demo.bean.Employee;
import cn.lyc.demo.bean.User;
import cn.lyc.demo.mapper.EmployeeMapper;
import cn.lyc.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserMapper userMapper;


   @GetMapping("/use/{account}")
    public User getUser(@PathVariable("account") String account){
       return userMapper.getUserByAccount(account);
    }

    @GetMapping("/use")
    public User insertUser(User user){
       userMapper.insertUser(user);
       return user;
    }

    //    @GetMapping("/dept/{id}")
//    public Department getDepartment(@PathVariable("id") Integer id){
//            return departmentMapper.getDeptById(id);
//    }
//    @GetMapping("/dept")
//    public  Department insertDept(Department department){
//        departmentMapper.insertDept(department);
//        return department;
//    }
//    @Autowired
//    EmployeeMapper employeeMapper;
//
//    //    @GetMapping("/dept/{id}")
////    public Department getDepartment(@PathVariable("id") Integer id){
////            return departmentMapper.getDeptById(id);
////    }
////    @GetMapping("/dept")
////    public  Department insertDept(Department department){
////        departmentMapper.insertDept(department);
////        return department;
////    }
//    @GetMapping("/emp/{id}")
//    public Employee getEmp(@PathVariable("id") Integer id){
//        return employeeMapper.getEmpById(id);
//    }

 }
