package com.algorithm.demo.design.factory.staticfactory;

/**
 * Created by IntelliJ IDEA.
 *
 * 测试类
 * @author huacy
 * @since  2017/07/06
 */
public class Test {

    public static void main(String[] args) {
        AbstractProduct abstractProduct = StaticFactory.buildApple();
        abstractProduct.eat();
        abstractProduct = StaticFactory.buildBanana();
        abstractProduct.eat();
    }
}
