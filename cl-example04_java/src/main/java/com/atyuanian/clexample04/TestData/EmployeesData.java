package com.atyuanian.clexample04.TestData;

import com.atyuanian.clexample04.Entities.Employee;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class EmployeesData {
    private static Map<String, Employee> employees = null;
    static {
        employees = new HashMap<String , Employee>();
        employees.put("1001",new Employee("1001","张三","技术开发部"));
        employees.put("1002",new Employee("1002","李四","ECS研发部"));
        employees.put("1003",new Employee("1003","王五","C1产品部"));
        employees.put("1004",new Employee("1004","赵六","销售部"));
    }

    public Employee getEmployeeByUsercode(String usercode){
        return employees.get(usercode);
    }

}
