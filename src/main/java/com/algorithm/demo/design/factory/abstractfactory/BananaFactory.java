package com.algorithm.demo.design.factory.abstractfactory;

/**
 * Created by IntelliJ IDEA.
 * <p>
 * 工厂实现类:吃香蕉
 *
 * @author huacy
 * @since 2017/07/06
 */
public class BananaFactory implements AbstractFactory {

    @Override
    public AbstractProduct build() {
        return new AchieveBanana();
    }
}
