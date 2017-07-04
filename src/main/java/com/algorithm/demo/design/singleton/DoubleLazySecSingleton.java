package com.algorithm.demo.design.singleton;

/**
 * Created by IntelliJ IDEA.
 * 双重校验
 * 懒加载
 * 线程安全
 * <p>
 * 每次同步效率低下
 *
 * @author huacy
 * @since 2017/07/04
 */
public class DoubleLazySecSingleton {

    private volatile static DoubleLazySecSingleton instance;

    private DoubleLazySecSingleton() {
    }

    public static DoubleLazySecSingleton getInstance() {
        if (null == instance) {
            synchronized (DoubleLazySecSingleton.class) {
                if (null == instance) {
                    instance = new DoubleLazySecSingleton();
                }
            }
        }
        return instance;
    }
}
