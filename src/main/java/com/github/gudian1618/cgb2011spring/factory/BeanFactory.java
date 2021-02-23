package com.github.gudian1618.cgb2011spring.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/2/23 8:51 下午
 * 工厂类
 * Bean在计算机中,可重用组件
 * JavaBean使用java预言程序编写的可重用组件
 * 业务bean:用于㔘业务逻辑系统,service dao
 * 实体bean:用于封装数据,比如为了封装信息而提供pojo对象
 * 需要提供配置文件xml properties
 * 在配置文件中配置service层和dao层的实现类
 * 配置内容为:key(唯一标识)=value(实现类的全限定类名)
 * 通过工程读取配置文件中的配置的全限定类名,利用反射创建类的实例
 */

public class BeanFactory {

    // 声明一个Properties对象,在静态代码块对其进行初始化
    private static Properties prop = null;

    static {
        try {
            prop = new Properties();
            // 获取指向config.properties文件的流对象
            // 获取加载当前类BeanFactory的类加载器
            ClassLoader classLoader = BeanFactory.class.getClassLoader();

            // 通过类加载器到类目录下加载config文件
            InputStream in = classLoader.getResourceAsStream("config.properties");
            prop.load(in);

            System.out.println(prop.getProperty("EmpService"));
            System.out.println(prop.getProperty("EmpDao"));

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("初始化Properties对象失败!");
        }
    }

    public static void main(String[] args) {
        System.out.println("BeanFactory.main()");
    }
}
