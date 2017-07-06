package com.algorithm.demo.design.factory.multifactory;

/**
 * Created by IntelliJ IDEA.
 *
 * 测试类
 * @author huacy
 * @since  2017/07/06
 */
public class Test {

    public static void main(String[] args) {
        MultiFactory multiFactory = new MultiFactory();
        AbstractProduct abstractProduct = multiFactory.buildApple();
        abstractProduct.eat();
        abstractProduct = multiFactory.buildBanana();
        abstractProduct.eat();
    }
}
