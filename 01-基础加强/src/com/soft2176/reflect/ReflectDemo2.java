package com.soft2176.reflect;

import com.soft2176.domain.Person;
import java.lang.reflect.Field;

/**
 * @description: 反射练习2-Class对象功能
 * @author: mth
 * @date: 2022-02-20
 **/

public class ReflectDemo2 {
    public static void main(String[] args) throws Exception{
        //0.获取Person的Class对象
        Class<Person> personClass = Person.class;
        //1.Field[] getFields()获取所有public修饰的成员变量
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("==========");
        //2.Field getField(String name)
        Field a = personClass.getField("a");
        //获取成员变量a值
        Person p = new Person();
        Object value = a.get(p);
        System.out.println(value);
        //设置a的p属性
        a.set(p,"张三");
        System.out.println(p);
        System.out.println("==========");
        //Field[] getDecloredFields():获取所有的成员变量，不考虑修饰符
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        //Field getDeclaredField(String name)
        Field d = personClass.getDeclaredField("d");
        //忽略访问权限修饰符的安全检查--暴力反射
        d.setAccessible(true);
        Object value2 = d.get(p);
        System.out.println(value2);
    }
}
