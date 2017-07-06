package com.algorithm.demo.design.factory.staticfactory;

/**
 * Created by IntelliJ IDEA.
 *
 * 具体接口动作实现类
 * @author huacy
 * @since  2017/07/06
 */
public class AchieveBanana implements AbstractProduct {

    @Override
    public void eat() {
        System.out.println("eat banana.");
    }
}