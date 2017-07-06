package com.algorithm.demo.design.factory.multifactory;

/**
 * Created by IntelliJ IDEA.
 * <p>
 * 工厂类
 *
 * @author huacy
 * @since 2017/07/06
 */
public class MultiFactory {

    public AbstractProduct buildApple() {
        return new AchieveApple();
    }

    public AbstractProduct buildBanana() {
        return new AchieveBanana();
    }
}
