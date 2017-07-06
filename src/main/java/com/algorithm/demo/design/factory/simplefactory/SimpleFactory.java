package com.algorithm.demo.design.factory.simplefactory;

/**
 * Created by IntelliJ IDEA.
 * <p>
 * 工厂类
 *
 * @author huacy
 * @since 2017/07/06
 */
public class SimpleFactory {

    public static AbstractProduct buildEat(String type) {
        if ("apple".equals(type)) {
            return new AchieveApple();
        } else {
            return new AchieveBanana();
        }
    }
}
