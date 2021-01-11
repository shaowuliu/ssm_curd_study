package com.lsw.curd.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.lsw.curd.bean.Employee;
import com.lsw.curd.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author lsw-shaowu
 * @date 2021/1/7
 */

@Controller
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
/*    这里出现了问题，在注入service时，会告诉我找不到service
    问题解决了，在这里自动注入是根据注解来的，如果能够自动注入的话，前面会有一个
    * 绿色的标记，并且可以点击调到那个被注入的对象去*/
    @RequestMapping("/emps")
    public String getEmps(@RequestParam(value = "pn",defaultValue ="1")int pn, Model model){


        //下面就是进行pagehelper的配置


        PageHelper.startPage(pn,5);

        List<Employee> emps= employeeService.getAll();

        PageInfo pageInfo=new PageInfo(emps,5);
        model.addAttribute("pageinfo",pageInfo);
        return "list";
    }
}
