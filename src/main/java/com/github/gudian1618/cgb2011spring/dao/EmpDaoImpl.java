package com.github.gudian1618.cgb2011spring.dao;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/2/23 8:32 下午
 */

public class EmpDaoImpl implements EmpDao {

    @Override
    public void addEmp() {
        System.out.println("Dao层addEmp()方法执行了...成功保存了一条员工信息");
    }
}
