package com.algorithm.demo.design.factory.abstractfactory;

/**
 * Created by IntelliJ IDEA.
 *
 * 抽象工厂类
 * @author huacy
 * @since  2017/07/06
 */
public interface AbstractFactory {

    /**
     * 动作:创建工厂实例对象
     */
    AbstractProduct build();
}
