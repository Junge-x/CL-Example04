package com.atyuanian.clexample04.Controller;

import com.atyuanian.clexample04.Entities.Employee;
import com.atyuanian.clexample04.TestData.EmployeesData;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin
public class ShowEmployees {

    @Autowired
    private EmployeesData employeesData;

//    @GetMapping("showemployee")
    @PostMapping("showemployee")
    public Employee ShowEmployeeByUsercode(@RequestBody JSONObject jsonObject){
        System.out.println(jsonObject);
        Map<String,Object> map = new HashMap();
        Employee employee = employeesData.getEmployeeByUsercode(jsonObject.getString("usercode"));
        map.put("employee",employee);
        return employee;
    }


}
