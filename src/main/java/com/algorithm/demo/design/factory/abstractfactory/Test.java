package com.algorithm.demo.design.factory.abstractfactory;

/**
 * Created by IntelliJ IDEA.
 *
 * 测试类
 * @author huacy
 * @since  2017/07/06
 */
public class Test {

    public static void main(String[] args) {
        // 吃苹果
        AbstractFactory abstractFactory = new AppleFactory();
        AbstractProduct abstractProduct = abstractFactory.build();
        abstractProduct.eat();

        // 吃香蕉
        abstractFactory = new BananaFactory();
        abstractProduct = abstractFactory.build();
        abstractProduct.eat();
    }
}
