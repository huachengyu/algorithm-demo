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

    private volatile static DoubleLazySecSingleton instance = null;

    private DoubleLazySecSingleton() {
    }

    public static DoubleLazySecSingleton getInstance() {
        if (null == instance) {
            synchronized (DoubleLazySecSingleton.class) {
                if (null == instance) {
                    // Java指令中创建对象和赋值操作是分开进行的
                    // 下面的new操作是分两步进行的
                    // JVM不保证执行顺序
                    // 可能先分配了对象的内存,后实例化对象
                    instance = new DoubleLazySecSingleton();
                }
            }
        }
        return instance;
    }
}
