package com.algorithm.demo.design.factory.abstractfactory;

/**
 * Created by IntelliJ IDEA.
 * <p>
 * 工厂实现类:吃苹果
 *
 * @author huacy
 * @since 2017/07/06
 */
public class AppleFactory implements AbstractFactory {

    @Override
    public AbstractProduct build() {
        return new AchieveApple();
    }
}
