package com.github.gudian1618.cgb2011spring.controller;

import com.github.gudian1618.cgb2011spring.service.EmpService;
import com.github.gudian1618.cgb2011spring.service.EmpServiceImpl;
import org.junit.Test;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/2/23 8:43 下午
 */

public class EmpController {

    private EmpService service = new EmpServiceImpl();

    @Test
    public void testAddEmp() {
        System.out.println("调用service层的方法添加员工信息...");
        service.addEmp();
    }

}
