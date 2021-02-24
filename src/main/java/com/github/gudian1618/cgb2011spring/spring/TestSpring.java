package com.github.gudian1618.cgb2011spring.spring;

import com.github.gudian1618.cgb2011spring.dao.EmpDao;
import com.github.gudian1618.cgb2011spring.service.EmpService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/2/24 7:38 下午
 * 测试spring框架功能
 */

public class TestSpring {

    // 获取spring容器对象
    private static ClassPathXmlApplicationContext ac;

    static {
        // 对ac进行初始化
        ac = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    /**
     * 1.通过spring容器创建EmpService和EmpDao
     */
    @Test
    public void testIOC() {
        // 通过spring容器对象获取EmpService接口的子类实例
        EmpService service = (EmpService) ac.getBean("empService");
        System.out.println(service);

        // 通过spring容器对象获取EmpDao接口的子类实例
        EmpDao dao = (EmpDao) ac.getBean("empDao");
        System.out.println(dao);


    }

}
