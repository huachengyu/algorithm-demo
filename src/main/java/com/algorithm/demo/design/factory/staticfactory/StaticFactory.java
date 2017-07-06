package com.algorithm.demo.design.factory.staticfactory;

/**
 * Created by IntelliJ IDEA.
 * <p>
 * 工厂类
 *
 * @author huacy
 * @since 2017/07/06
 */
public class StaticFactory {

    public static AbstractProduct buildApple() {
        return new AchieveApple();
    }

    public static AbstractProduct buildBanana() {
        return new AchieveBanana();
    }
}
