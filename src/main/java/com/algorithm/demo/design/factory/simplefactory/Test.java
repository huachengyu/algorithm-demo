package com.algorithm.demo.design.factory.simplefactory;

/**
 * Created by IntelliJ IDEA.
 *
 * 测试类
 * @author huacy
 * @since  2017/07/06
 */
public class Test {

    public static void main(String[] args) {
        AbstractProduct abstractProduct = SimpleFactory.buildEat("apple");
        abstractProduct.eat();
        abstractProduct = SimpleFactory.buildEat("banana");
        abstractProduct.eat();
    }
}
