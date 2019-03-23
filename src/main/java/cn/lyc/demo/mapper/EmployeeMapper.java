package cn.lyc.demo.mapper;

import cn.lyc.demo.bean.Employee;

public interface EmployeeMapper {


    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}
