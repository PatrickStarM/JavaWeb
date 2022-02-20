package com.soft2176.junit;

/**
 * @description: 计算器测试类
 * @author: mth
 * @date: 2022-02-19
 */

public class CalculatorTest {
    public static void main(String[] args) {
        //创建对象
        Calculator cal = new Calculator();
        //调用add方法
        int result = cal.add(1,2);
        System.out.println(result);
        //调用sub方法
        int result1 = cal.sub(1,1);
        System.out.println(result1);
    }
}
