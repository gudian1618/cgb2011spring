package com.github.gudian1618.cgb2011spring.pojo;

/**
 * @author gudian1618
 * @version v1.0
 * @date 2021/2/24 8:48 下午
 */

public class User {

    private String name;
    private Integer age;
    private UserInfo info;

    public User() {
    }

    public User(String name, Integer age, UserInfo info) {
        this.name = name;
        this.age = age;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public UserInfo getInfo() {
        return info;
    }

    public void setInfo(UserInfo info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "User{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", info=" + info +
            '}';
    }
}
