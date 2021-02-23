package com.github.gudian1618.cgb2011spring.service;

import com.github.gudian1618.cgb2011spring.dao.EmpDao;
import com.github.gudian1618.cgb2011spring.dao.EmpDaoImpl;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/2/23 8:31 下午
 */

public class EmpServiceImpl implements EmpService {

    private EmpDao dao = new EmpDaoImpl();

    @Override
    public void addEmp() {
        System.out.println("调用dao层的方法添加员工信息...");
        dao.addEmp();
    }
}
