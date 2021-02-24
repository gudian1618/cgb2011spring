package com.github.gudian1618.cgb2011spring.spring;

import com.github.gudian1618.cgb2011spring.dao.EmpDao;
import com.github.gudian1618.cgb2011spring.pojo.User;
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

    /**
     * 2.测试spring bean对象的单实例和多实例
     * 单实例:spring容器从始至终只会为该实例创建爱哪一个实例,每次获取的实例的都是第一次创建的实例
     * 优点:节省资源和空间
     * 缺点:当多个线程访问同一个对象的成员变量时,可能会出现线程安全问题
     * 多实例:spring容器每次都会为该类穿件一个新的实例,每次获取的都是不同的实例
     * 优点:每个线程获取的都是不同的对象,不会存在线程安全问题
     * 缺点:会更加消耗资源和内存
     * 因此,在没有线程安全问题推荐使用单实例
     * 存在线程安全问题,多个线程访问同一个类对象,推荐使用多实例
     */
    @Test
    public void testBean() {
        // 1.通过spring容器对象获取
        User u1 = (User) ac.getBean("user");
        User u2 = (User) ac.getBean("user");
        User u3 = (User) ac.getBean("user");
        // 2.判断u1和u2是否相等
        if (u1 == u2 && u2 == u3) {
            // 相等,则说明当前类的实例是单实例的
            System.out.println("当前类的实例是单实例的...");
        } else {
            // 不相等,则说明当前类的实例是多实例
            System.out.println("当前类的实例是多实例...");
        }
    }

}
