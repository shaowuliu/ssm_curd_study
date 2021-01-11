package com.lsw.curd.test;

import com.lsw.curd.bean.Employee;
import org.junit.Before;
import com.github.pagehelper.PageInfo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

/**
 * @author lsw-shaowu
 * @date 2021/1/7
 * spring提供的测试请求功能
 */


@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:spring-mvc.xml"})
public class MvcTest {

    @Autowired
    WebApplicationContext context;

    MockMvc mockMvc;

    @Before
   public void initMockMvc(){
        mockMvc= MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void  MvcTest() throws  Exception{
        //模拟请求拿到返回值
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/emps").param("pn", "5"))
                .andReturn();

        //请求成功以后，请求域中会有pageInfo；我们可以取出pageInfo进行验证
        MockHttpServletRequest request = result.getRequest();
        PageInfo pi = (PageInfo) request.getAttribute("pageinfo");

        /*这里出现了问题，查出来pi为空，所以没有查出来数据吗
        * 问题解决，问题是两个，employee中没有无参构造方法，
        * 第二个是空指针异常，当时查出pageinfo有内容，但是pi是空，最后发现，是在取pageinfo
        * 时，使用的两个名字不一样，所有没取到内容。
        * */

        System.out.println("当前页码："+pi.getPageNum());
        System.out.println("总页码："+pi.getPages());
        System.out.println("总记录数："+pi.getTotal());
        System.out.println("在页面需要连续显示的页码");
        int[] nums = pi.getNavigatepageNums();
        for (int i : nums) {
            System.out.print(" "+i);
        }

        //获取员工数据
        List<Employee> list = pi.getList();
        for (Employee employee : list) {
            System.out.println("ID："+employee.getEmpId()+"==>Name:"+employee.getEmpName());
        }
    }
}
