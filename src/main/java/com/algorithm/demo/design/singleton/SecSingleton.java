package com.algorithm.demo.design.singleton;

/**
 * Created by IntelliJ IDEA.
 *
 * 线程安全
 *
 * 不是懒加载
 *
 * @author huacy
 * @since  2017/07/04
 */
public class SecSingleton {

    private static SecSingleton instance = new SecSingleton();

    private SecSingleton() {}

    public static SecSingleton getInstance() {
        return instance;
    }
}
