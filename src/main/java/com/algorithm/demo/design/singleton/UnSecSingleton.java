package com.algorithm.demo.design.singleton;

/**
 * Created by IntelliJ IDEA.
 *
 * 懒加载
 * 线程不安全
 *
 * @author huacy
 * @since  2017/07/04
 */
public class UnSecSingleton {

    // 私有静态实例,NULL,初始化未被引用,延迟加载
    private static UnSecSingleton instance = null;

    private UnSecSingleton(){}

    // 此处若不加synchronized关键字,则为线程不安全的单例模式
    public static UnSecSingleton getInstance() {
        if(null == instance) {
            instance = new UnSecSingleton();
        }
        return instance;
    }
}
