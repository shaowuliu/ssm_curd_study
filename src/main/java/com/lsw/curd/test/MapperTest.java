package com.lsw.curd.test;

import com.lsw.curd.bean.Department;
import com.lsw.curd.bean.Employee;
import com.lsw.curd.dao.DepartmentMapper;
import com.lsw.curd.dao.EmployeeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author lsw-shaowu
 * @date 2021/1/7
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"}) //指定spring的配置文件，自动生成ioc容器
public class MapperTest {
    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeeMapper employeeMapper;

/*    测试departmentmapper*/
    @Test
    public void test1(){

        //1.创建SpringIOC容器
        ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.从容器中获取mapper
        ioc.getBean(DepartmentMapper.class);
        
        System.out.println(departmentMapper);

        //1、插入几个部门
		departmentMapper.insertSelective(new Department(null, "dfad"));
		departmentMapper.insertSelective(new Department(null, "测试部"));

        //2、生成员工数据，测试员工插入
        employeeMapper.insertSelective(new Employee(null, "Jerry", "M", "Jerry@atguigu.com", 1));

        //3、批量插入多个员工；批量，使用可以执行批量操作的sqlSession。

		for(int i=0;i<5;i++){
			employeeMapper.insertSelective(new Employee(null, "Jerry","M", "Jerry@atguigu.com", 1));
		}
    }
}
