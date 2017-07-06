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

    // JVM内部的机制能够保证当一个类被加载的时候
    // 这个类的加载过程是线程互斥的。
    public static SecSingleton getInstance() {
        return instance;
    }
}
