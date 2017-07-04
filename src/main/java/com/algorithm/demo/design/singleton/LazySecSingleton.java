package com.algorithm.demo.design.singleton;

/**
 * Created by IntelliJ IDEA.
 *
 * 懒加载
 * 线程安全
 *
 * 每次同步效率低下
 *
 * @author huacy
 * @since  2017/07/04
 */
public class LazySecSingleton {

    private static LazySecSingleton instance;

    private LazySecSingleton(){}

    // 此处若不加synchronized关键字,则为线程不安全的单例模式
    public static synchronized LazySecSingleton getInstance() {
        if(null == instance) {
            instance = new LazySecSingleton();
        }
        return instance;
    }
}
